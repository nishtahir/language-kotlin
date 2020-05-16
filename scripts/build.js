const fs = require("fs");
const path = require("path");
const plist = require("plist");
const json = require("format-json");
const yaml = require("yamljs");

const resolvedPath = path.resolve(__dirname, "../Kotlin.YAML-tmLanguage");
const data = fs.readFileSync(resolvedPath, "utf8");
const parsedFile = yaml.parse(data);

const destDir = path.resolve(__dirname, "../syntax/");
if (!fs.existsSync(destDir)) {
  fs.mkdirSync(destDir);
}

console.log("Generating Xml file...");
const xmlData = plist.build(parsedFile);
fs.writeFileSync(
  path.resolve(__dirname, "../syntax/Kotlin.tmLanguage"),
  xmlData
);

console.log("Generating Json file...");
let jsonData = json.plain(parsedFile);
fs.writeFileSync(
  path.resolve(__dirname, "../syntax/Kotlin.JSON-tmLanguage"),
  jsonData
);

console.log("Generating Yaml file...");
let yamlData = yaml.stringify(parsedFile, 6);
fs.writeFileSync(
  path.resolve(__dirname, "../syntax/Kotlin.YAML-tmLanguage"),
  yamlData
);
