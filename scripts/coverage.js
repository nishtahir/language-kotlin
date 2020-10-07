const path = require("path");
const plist = require("plist");
const {
    safeWriteFileSync,
    getAllFilesInDir,
    readFileSync
} = require("./util");
const {
    parseGrammarTestCase,
    runGrammarTestCase,
    createRegistry
} = require("vscode-tmgrammar-test/dist/src/unit/index");
const lcovWrite = require("lcov-write");
const Yaml = require('yaml');
const YamlSourceMap = require('yaml-source-map');

const distDir = path.resolve(__dirname, "../", "dist/");
const buildDir = path.resolve(__dirname, "../", "build/");
const testDir = path.resolve(__dirname, "../", "test/");
const srcDir = path.resolve(__dirname, "../", "src/");

const compiledSourcePath = path.resolve(distDir, "Kotlin.JSON-tmLanguage");
const compiledSource = JSON.parse(readFileSync(compiledSourcePath));
const instrumentedTree = instrumentScopesTree(compiledSource);
console.log(`${instrumentedTree.probesInserted} probes inserted...`);

const xml = plist.build(instrumentedTree.scopesTree);
const instrumentedSourcePath = path.resolve(buildDir, "Kotlin.tmLanguage");

// vscode-tmgrammar-test requires this to be a file on disk.
// This is not ideal but we have to work with it for now...
safeWriteFileSync(instrumentedSourcePath, xml);

const testSources = getAllFilesInDir(testDir);
const appSources = getAllFilesInDir(srcDir);
generateCoverageReports(appSources, testSources, instrumentedSourcePath);

/**
 * Generate an LCOV compatible coverage report for the given inputs
 * @param {Array<string>} appSources application sources to map coverage data to
 * @param {Array<string>} testSources test sources to test coverage
 * @param {string} instrumentedSourcePath instrumented compiled source
 */
async function generateCoverageReports(appSources, testSources, instrumentedSourcePath) {
    const registry = createRegistry([instrumentedSourcePath]);
    const scopesHit = await runTestCases(registry, testSources);

    const allHits = Object.values(scopesHit)
        .flat()
        .filter((hit) => hit !== 'source.kotlin')
        .map((hit) => hit.endsWith(".name") ? hit.slice(0, -5) : hit);

    const sourceMap = new YamlSourceMap()

    // Index application sources
    const indexedSources = appSources.map((sourceFile) => {
        const sourceContent = readFileSync(sourceFile);
        const document = Yaml.parseDocument(sourceContent, { keepCstNodes: true });
        return {
            source: document.toJSON(),
            index: sourceMap.index(document, { filename: sourceFile }),
            filename: sourceFile
        };
    });

    const coverageData = [];

    // Find match all hits in sources
    indexedSources.forEach(indexedSource => {
        const { source, index, filename } = indexedSource;
        const coverage = createCoverageData(filename);

        const lineData = {};

        // Seed lineData with testable lines.
        // this includes anything that has a scope
        findScopes(source)
            .map((path) => path.slice(0, -1))
            .map((path) => sourceMap.lookup(path, index))
            .forEach((line) => {
                const start = line.start.line;
                const end = line.end.line;
                // End is not inclusive
                for (let i = start; i < end; i++) {
                    if (!lineData[i]) {
                        lineData[i] = 0;
                    }
                }
            });

        // We now know how many lines we can test
        coverage.lines.found = Object.keys(lineData).length;

        allHits.forEach((hit) => {
            const mapping = sourceMap.lookup(hit.split('.'), index);
            if (mapping) {
                const start = mapping.start.line;
                const end = mapping.end.line;
                // End is not inclusive
                for (let i = start; i < end; i++) {
                    lineData[i]++;
                }
            }
        });

        // Count lines that have at least 1 hit 
        coverage.lines.hit = Object.values(lineData).filter((value) => value > 0).length;

        // Associate hit count and line numbers
        // for coverage report
        for (const lineNum in lineData) {
            if (lineData.hasOwnProperty(lineNum)) {
                const hits = lineData[lineNum];
                coverage.lines.details.push({
                    line: lineNum,
                    hit: hits
                });
            }
        }

        coverageData.push(coverage);
    });

    // Write coverage data to file
    const coverageSource = lcovWrite.stringify(coverageData);
    safeWriteFileSync(path.resolve(buildDir, "coverage.lcov"), coverageSource);
}

/**
 * Generate an LCOV coverage data template
 * @param {string} filename filename of the file undertest
 */
function createCoverageData(filename) {
    return {
        title: filename,
        file: filename,
        functions: {
            hit: 0,
            found: 0,
            details: []
        },
        branches: {
            hit: 0,
            found: 0,
            details: []
        },
        lines: {
            hit: 0,
            found: 0,
            details: []
        }
    };
}

/**
 * Run test cases against a test sources.
 * @param {object} registry - registry containing scopes to test against.
 * @param {Array<string>} testSources sources to test.
 * @returns {object} map of file to scopes that were hit.
 */
async function runTestCases(registry, testSources) {
    let scopesHit = {};
    for (let i = 0; i < testSources.length; i++) {
        const file = testSources[i];
        const results = await runSingleTestCase(registry, file);
        const actualScopesFound = results.map((result) => result.actual).flat();
        scopesHit[file] = actualScopesFound;
    }
    return scopesHit;
}

/**
 * Run a single test case
 * @param {object} registry - scopes to test against
 * @param {string} file - path to file to test
 */
async function runSingleTestCase(registry, file) {
    const testCase = parseGrammarTestCase(readFileSync(file));
    return await runGrammarTestCase(registry, testCase);
}

/**
 * Find all testable scopes for the given object
 * These are scopes that contain a 'name' element
 * @param {object} obj - object to search
 * @param {Array<string>} qualifiedPath - current path to the object
 */
function findScopes(obj, qualifiedPath = []) {
    let scopes = [];
    for (let key in obj) {
        const value = obj[key];
        const scopedQualifiedPath = [...qualifiedPath, key];
        if (typeof value === "object") {
            scopes = scopes.concat(findScopes(value, scopedQualifiedPath));
        } else {
            if (key === "name") {
                scopes.push(scopedQualifiedPath);
            }
        }
    }
    return scopes;
}

/**
 * Instruments a given scope tree by replacing its named scopes
 * with debug scope names for coverage tracking. Names are uniquely determined
 * by generating a fully qualified path to the scope.
 * 
 * @param {object} scopesTree - tree to instrument
 */
function instrumentScopesTree(scopesTree) {
    let probeCount = 0;

    /**
     * Recursively inserts coverage tracking probes into a given 
     * tmlanguage scope tree. 
     * Nested to keep the outer function pure.
     * @param {object} obj - tree to instrument
     * @param {arr} qualifiedPath qualified path of the current scopes if this is nested
     */
    function insertProbes(obj, qualifiedPath = []) {
        for (let key in obj) {
            const value = obj[key];
            const scopedQualifiedPath = [...qualifiedPath, key];
            if (typeof value === "object") {
                insertProbes(obj[key], scopedQualifiedPath);
            } else {
                if (key === 'name') {
                    const qualifiedPathStr = scopedQualifiedPath.join('.');
                    obj[key] = qualifiedPathStr;
                    probeCount++;
                }
            }
        }
    }

    // Mutate the tree inserting coverage scopes
    insertProbes(scopesTree);

    return {
        probesInserted: probeCount,
        scopesTree
    }
}
