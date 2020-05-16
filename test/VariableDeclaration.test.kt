// SYNTAX TEST "source.kotlin" "Variable Declaration"
var x = 9
// <--- storage.type.kotlin
//    ^ keyword.operator.assignment.kotlin
//      ^ constant.numeric.integer.kotlin

const val CONSTANT = 99
// <---- storage.modifier.kotlin
//    ^^^ storage.type.kotlin

val items = listOf("apple", "banana")
//          ^^^^^^ support.function.kotlin
//                ^ punctuation.section.group.begin.kotlin
//                 ^ string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                  ^^^^^ string.quoted.double.kotlin
//                       ^ string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                        ^ punctuation.seperator.kotlin
//                          ^ string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                           ^^^^^^ string.quoted.double.kotlin
//                                 ^ string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                                  ^ punctuation.section.group.end.kotlin