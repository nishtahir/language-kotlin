// SYNTAX TEST "source.kotlin" "Double quotes in character value."

   foo('"')
//      ^ -string.quoted.double.kotlin

   val same = '"' == '"'
//             ^ -string.quoted.double.kotlin
//                    ^ -string.quoted.double.kotlin
