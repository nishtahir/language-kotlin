const fs = require("fs");
const path = require("path");
const yaml = require("yamljs");

var sourceFiles = fs.readdirSync(path.resolve(__dirname, "../", "src/"));
sourceFiles.forEach((file) => {
  const resolvedPath = path.resolve(__dirname, "../", "src/", file);

  console.log("Formatting " + resolvedPath);

  const source = fs.readFileSync(resolvedPath, "utf8");
  const parsedFile = yaml.parse(source);

  let yamlData = yaml.stringify(parsedFile, {
    indent: 2,
    indentSeq: true,
  });
  fs.writeFileSync(resolvedPath, yamlData);
});
