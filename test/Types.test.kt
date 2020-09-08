// SYNTAX TEST "source.kotlin" "Types"

  val test: () -> Unit = {}
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^ source.kotlin
//        ^ source.kotlin keyword.operator.declaration.kotlin
//         ^ source.kotlin
//          ^ source.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//           ^ source.kotlin meta.group.kotlin punctuation.section.group.end.kotlin
//            ^ source.kotlin
//             ^^ keyword.operator.type.function.kotlin
//               ^ source.kotlin
//                ^^^^ source.kotlin support.class.kotlin
//                    ^ source.kotlin
//                     ^ source.kotlin keyword.operator.assignment.kotlin
//                      ^ source.kotlin
//                       ^ source.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
//                        ^ source.kotlin meta.block.kotlin punctuation.section.group.end.kotlin

  val type: Type? = Type()
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^ source.kotlin
//        ^ source.kotlin keyword.operator.declaration.kotlin
//         ^ source.kotlin
//          ^^^^ source.kotlin entity.name.type.class.kotlin
//              ^^ source.kotlin
//                ^ source.kotlin keyword.operator.assignment.kotlin
//                 ^ source.kotlin
//                  ^^^^ source.kotlin entity.name.type.class.kotlin
//                      ^ source.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//                       ^ source.kotlin meta.group.kotlin punctuation.section.group.end.kotlin