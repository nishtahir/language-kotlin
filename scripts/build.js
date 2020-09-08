const fs = require("fs");
const path = require("path");
const plist = require("plist");
const json = require("format-json");
const yaml = require("yamljs");
const deepmerge = require("deepmerge");

const sourcePath = path.resolve(__dirname, "../", "src/");

const data = fs.readdirSync(sourcePath).reduce((acc, file) => {
  const filePath = path.resolve(sourcePath, file);
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

const destDir = path.resolve(__dirname, "../dist/");
if (!fs.existsSync(destDir)) {
  fs.mkdirSync(destDir);
}

console.log("Generating Json file...");
fs.writeFileSync(
  path.resolve(destDir, "Kotlin.JSON-tmLanguage"),
  json.plain(data)
);

console.log("Generating Yaml file...");
fs.writeFileSync(
  path.resolve(destDir, "Kotlin.YAML-tmLanguage"),
  yaml.stringify(data, 6)
);

console.log("Generating Xml file...");
const xmlData = plist.build(data);
fs.writeFileSync(path.resolve(destDir, "Kotlin.tmLanguage"), xmlData);
