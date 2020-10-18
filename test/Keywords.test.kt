// SYNTAX TEST "source.kotlin" "Keywords"

  if (x !is String) return
//^^ source.kotlin keyword.control.conditional.kotlin
//  ^ source.kotlin
//   ^ source.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//    ^^ source.kotlin meta.group.kotlin
//      ^^^ source.kotlin meta.group.kotlin keyword.operator.kotlin
//         ^ source.kotlin meta.group.kotlin
//          ^^^^^^ source.kotlin meta.group.kotlin support.class.kotlin
//                ^ source.kotlin meta.group.kotlin punctuation.section.group.end.kotlin
//                 ^ source.kotlin
//                  ^^^^^^ source.kotlin keyword.control.kotlin

  if (x is String && x.length > 0) {
//^^ source.kotlin keyword.control.conditional.kotlin
//  ^ source.kotlin
//   ^ source.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//    ^^ source.kotlin meta.group.kotlin
//      ^^ source.kotlin meta.group.kotlin keyword.operator.kotlin
//        ^ source.kotlin meta.group.kotlin
//         ^^^^^^ source.kotlin meta.group.kotlin support.class.kotlin
//               ^ source.kotlin meta.group.kotlin
//                ^^ source.kotlin meta.group.kotlin keyword.operator.logical.kotlin
//                  ^^ source.kotlin meta.group.kotlin
//                    ^ source.kotlin meta.group.kotlin punctuation.accessor.dot.kotlin
//                     ^^^^^^^ source.kotlin meta.group.kotlin
//                            ^ source.kotlin meta.group.kotlin keyword.operator.comparison.kotlin
//                             ^ source.kotlin meta.group.kotlin
//                              ^ source.kotlin meta.group.kotlin constant.numeric.integer.kotlin
//                               ^ source.kotlin meta.group.kotlin punctuation.section.group.end.kotlin
//                                ^ source.kotlin
//                                 ^ source.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
      print(x.length) // x is automatically cast to String
//^^^^ source.kotlin meta.block.kotlin
//    ^^^^^ source.kotlin meta.block.kotlin support.function.kotlin
//         ^ source.kotlin meta.block.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//          ^ source.kotlin meta.block.kotlin meta.group.kotlin
//           ^ source.kotlin meta.block.kotlin meta.group.kotlin punctuation.accessor.dot.kotlin
//            ^^^^^^ source.kotlin meta.block.kotlin meta.group.kotlin
//                  ^ source.kotlin meta.block.kotlin meta.group.kotlin punctuation.section.group.end.kotlin
//                   ^ source.kotlin meta.block.kotlin
//                    ^^ source.kotlin meta.block.kotlin punctuation.definition.comment.kotlin comment.line.double-slash.kotlin
//                      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin meta.block.kotlin punctuation.definition.comment.kotlin
  }
//^ source.kotlin meta.block.kotlin punctuation.section.group.end.kotlin

  try {
//^^^ source.kotlin keyword.control.catch-exception.kotlin
//   ^ source.kotlin
//    ^ source.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
  }
//^ source.kotlin meta.block.kotlin punctuation.section.group.end.kotlin
  catch (e: SomeException) {
//^^^^^ source.kotlin keyword.control.catch-exception.kotlin
//     ^ source.kotlin
//      ^ source.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//       ^ source.kotlin meta.group.kotlin
//        ^ source.kotlin meta.group.kotlin keyword.operator.declaration.kotlin
//         ^ source.kotlin meta.group.kotlin
//          ^^^^^^^^^^^^^ source.kotlin meta.group.kotlin entity.name.type.class.kotlin
//                       ^ source.kotlin meta.group.kotlin punctuation.section.group.end.kotlin
//                        ^ source.kotlin
//                         ^ source.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
  }
//^ source.kotlin meta.block.kotlin punctuation.section.group.end.kotlin
  finally {
//^^^^^^^ source.kotlin keyword.control.catch-exception.kotlin
//       ^ source.kotlin
//        ^ source.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
  }
//^ source.kotlin meta.block.kotlin punctuation.section.group.end.kotlin