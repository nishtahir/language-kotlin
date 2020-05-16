// SYNTAX TEST "source.kotlin" "Camel cased variable declaration should not have class"

camelCased?.let { print(it) }
//   ^^^^^ -entity.name.type.class.kotlin
//        ^^ punctuation.accessor.dot.safe.kotlin
//          ^^^ support.function.kotlin
//              ^ meta.block.kotlin punctuation.section.group.begin.kotlin
//                     ^ meta.block.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//                        ^ meta.block.kotlin meta.group.kotlin punctuation.section.group.end.kotlin
//                          ^ meta.block.kotlin punctuation.section.group.end.kotlin