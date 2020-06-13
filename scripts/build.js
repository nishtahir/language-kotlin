const fs = require("fs");
const path = require("path");
const plist = require("plist");
const json = require("format-json");
const yaml = require("yamljs");
const deepmerge = require("deepmerge");

var sourceFiles = fs.readdirSync(path.resolve(__dirname, "../", "src/"));

let data = {};
sourceFiles.forEach((file) => {
  const resolvedPath = path.resolve(__dirname, "../", "src/", file);
  try {
    const source = fs.readFileSync(resolvedPath, "utf8");
    if(source.trim().length === 0) {
      return; // skip empty files
    }
  
    const parsedFile = yaml.parse(source);
    data = deepmerge(data, parsedFile);
  } catch (e) {
    console.log("An error occured while parsing file...");
    console.log(resolvedPath);
    console.log(e);
    process.exit(1);
  }
});

const destDir = path.resolve(__dirname, "../dist/");
if (!fs.existsSync(destDir)) {
  fs.mkdirSync(destDir);
}

console.log("Generating Xml file...");
const xmlData = plist.build(data);
fs.writeFileSync(path.resolve(__dirname, "../dist/Kotlin.tmLanguage"), xmlData);

console.log("Generating Json file...");
let jsonData = json.plain(data);
fs.writeFileSync(
  path.resolve(__dirname, "../dist/Kotlin.JSON-tmLanguage"),
  jsonData
);

console.log("Generating Yaml file...");
let yamlData = yaml.stringify(data, 6);
fs.writeFileSync(
  path.resolve(__dirname, "../dist/Kotlin.YAML-tmLanguage"),
  yamlData
);
