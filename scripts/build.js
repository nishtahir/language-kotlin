/**
 * This script is used to generate the final syntax files from the source files.
 * It merges all source files into a single file and generates the final syntax files.
 * - Kotlin.JSON-tmLanguage
 * - Kotlin.YAML-tmLanguage
 * - Kotlin.tmLanguage
 */

const fs = require("fs");
const path = require("path");
const plist = require("plist");
const json = require("format-json");
const yaml = require("yamljs");
const deepmerge = require("deepmerge");
const { safeWriteFileSync } = require("./util");

const SOURCE_PATH = path.resolve(__dirname, "../", "src/");
const OUTPUT_PATH = path.resolve(__dirname, "../dist/");

const data = fs.readdirSync(SOURCE_PATH).reduce((acc, file) => {
  const filePath = path.resolve(SOURCE_PATH, file);
  try {
    const source = fs.readFileSync(filePath, "utf8");
    // skip empty files
    if (source.trim().length === 0) {
      return acc;
    }

    const parsedFile = yaml.parse(source);
    return deepmerge(acc, parsedFile);
  } catch (err) {
    console.log("An error occured while parsing file...");
    console.log(filePath, "\n", err);
    process.exit(1);
  }
}, {});

console.log("Generating Json file...");
safeWriteFileSync(
  path.resolve(OUTPUT_PATH, "Kotlin.JSON-tmLanguage"),
  json.plain(data),
);

console.log("Generating Yaml file...");
safeWriteFileSync(
  path.resolve(OUTPUT_PATH, "Kotlin.YAML-tmLanguage"),
  yaml.stringify(data, 6),
);

console.log("Generating Xml file...");
const xmlData = plist.build(data);
safeWriteFileSync(path.resolve(OUTPUT_PATH, "Kotlin.tmLanguage"), xmlData);
