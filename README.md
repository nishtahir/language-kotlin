# Language Kotlin

A textmate compatible grammar for the Kotlin language.

Master  
![Node.js CI](https://github.com/nishtahir/language-kotlin/workflows/Node.js%20CI/badge.svg?branch=master)

Develop  
![Node.js CI](https://github.com/nishtahir/language-kotlin/workflows/Node.js%20CI/badge.svg?branch=develop)


# Contributing

## Setup

To generate build artifacts you will need to install dependencies

```
$ npm install
```

## Build

Changes to the grammar should be made in the grammar sources in the `src` folder. 
These will be merged at build time and used to produce the final artifact.

Once you are satisfied with changes you've made, you will need to generate 
`xml` and `json` variants for distribution. 
There's a handy build script available to automate this process which will output
the merged sources to the `dist` directory.

```
$ npm run build
```

## Testing

Tests are run using `vscode-tmgrammar-test` against tests cases 
in `/test` as well as generated snapshots in `/snapshot`.

> All changes to the grammar must be accompanied by tests.

The test suite can be run using `npm`

```
$ npm test
```

# Code of Conduct

Please note we have a [code of conduct](./CODE_OF_CONDUCT.md), 
please follow it in all your interactions with the project.
