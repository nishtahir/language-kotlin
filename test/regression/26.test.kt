// SYNTAX TEST "source.kotlin" "Double quotes in character value and quadrupel double quotes"

   foo('"')
//      ^ -string.quoted.double.kotlin

   val same = '"' == '"'
//             ^ -string.quoted.double.kotlin
//                    ^ -string.quoted.double.kotlin

   foo(""""."""")
//^^^^ source.kotlin
//          ^ -punctuation.definition.string.end.kotlin
//             ^ -punctuation.definition.string.begin.kotlin
//              ^^ -string.quoted.double.kotlin