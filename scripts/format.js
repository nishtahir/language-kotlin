/**
 * This script formats all YAML files in the src/ directory.
 * It is used to ensure a consistent code style.
 */

const fs = require("fs");
const path = require("path");
const yaml = require("yamljs");

const sourceDirPath = path.resolve(__dirname, "../", "src/");
const sourceFiles = fs.readdirSync(sourceDirPath);

sourceFiles.forEach((file) => {
  const filePath = path.resolve(sourceDirPath, file);
  console.log("Formatting " + filePath);

  const source = fs.readFileSync(filePath, "utf8");
  if (source.trim().length === 0) {
    return; // skip empty files
  }

  const parsedFile = yaml.parse(source);
  const yamlData = yaml.stringify(parsedFile, {
    indent: 2,
    indentSeq: true,
  });
  fs.writeFileSync(filePath, yamlData);
});
