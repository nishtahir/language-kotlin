/**
 * This script formats all YAML files in the src/ directory.
 * It is used to ensure a consistent code style.
 */

import path from "path";
import yaml from "yamljs";
import { readdirSync, readFileSync, writeFileSync } from "fs";
import { __dirname } from "./util.js";

const sourceDirPath = path.resolve(__dirname, "../", "src/");
const sourceFiles = readdirSync(sourceDirPath);

sourceFiles.forEach((file) => {
  const filePath = path.resolve(sourceDirPath, file);
  console.log("Formatting " + filePath);

  const source = readFileSync(filePath, "utf8");
  if (source.trim().length === 0) {
    return; // skip empty files
  }

  const parsedFile = yaml.parse(source);
  const yamlData = yaml.stringify(parsedFile, {
    indent: 2,
    indentSeq: true,
  });
  writeFileSync(filePath, yamlData);
});
