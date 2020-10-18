# Language Kotlin

A textmate compatible grammar for the Kotlin language.

![Node.js CI](https://github.com/nishtahir/language-kotlin/workflows/Node.js%20CI/badge.svg?branch=master)
[![codecov](https://codecov.io/gh/nishtahir/language-kotlin/branch/master/graph/badge.svg)](https://codecov.io/gh/nishtahir/language-kotlin)

## Setup

This project is built using a couple of handy node scripts. Begin by installing the
required dependencies.

```
$ npm install
```

## Build

Changes to the grammar should be made in the `src` folder. These are merged at build 
time and used to produce the final artifact.

Once you are satisfied with your changes, you will need to generate 
`xml` and `json` variants for distribution. 
There's a handy build script available to automate this process.

```
$ npm run build
```

This will outputs the merged sources to the `dist` directory. At this point
it's highly recommended that you test your changes using [GitHub Lightshow](https://github-lightshow.herokuapp.com/). There's some manual work involved in doing this however this is the closest
representation to what it would look like when it's deployed available right now.

You can format your sources using the code formatting script.

```
$ npm run format
```

## Testing

> All changes to the grammar must be accompanied by tests.

Tests are run using [`vscode-tmgrammar-test`](https://github.com/PanAeon/vscode-tmgrammar-test). 
Test cases and regression tests are available in the `/test` folder.

Generated snapshots are available in the `/snapshots` folder and should be updated with changes
to the grammar.

The test suite can be run using `npm`

```
$ npm test
```

## Useful resources

* [GitHub Lightshow](https://github-lightshow.herokuapp.com/) - Useful for testing Grammar sources against Code to inspect the highlighting behavior
* [Sublime Text scope naming reference](https://www.sublimetext.com/docs/3/scope_naming.html) - Reference on Textmate scope naming


## Code of Conduct

Please note we have a [code of conduct](./CODE_OF_CONDUCT.md) which _must_ be observed in interactions with the project.
