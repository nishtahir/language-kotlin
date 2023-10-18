const fs = require("fs");
const path = require("path");

/**
 * Read a file from a given path
 * @param {string} path file to read
 */
function readFileSync(path) {
  return fs.readFileSync(path, "utf8");
}

/**
 * Wrapper around [writeFileSync] that creates
 * the directory to write in before performing the write.
 * @param {string} dest
 * @param {string} content
 */
function safeWriteFileSync(dest, content) {
  const dir = dest.substring(0, dest.lastIndexOf("/") + 1);
  if (!fs.existsSync(dir)) {
    fs.mkdirSync(dir);
  }
  fs.writeFileSync(dest, content);
}

/**
 * Returns a list of files in the given directory
 * @param {string} dirPath - path to directory
 * @param {Array<string>} files - files in parent directory
 */
function getAllFilesInDir(dirPath, files = []) {
  fs.readdirSync(dirPath).forEach((file) => {
    if (fs.statSync(dirPath + "/" + file).isDirectory()) {
      files = getAllFilesInDir(dirPath + "/" + file, files);
    } else {
      files.push(path.join(dirPath, "/", file));
    }
  });
  return files;
}

module.exports = {
  safeWriteFileSync,
  getAllFilesInDir,
  readFileSync,
};
