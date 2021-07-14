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

// Taken from: https://github.com/Kotlin/KEEP/blob/master/notes/value-classes.md#value-interfaces
value interface ImmutableList<T> {
// <--------------- source.kotlin meta.class.kotlin storage.modifier.kotlin
//              ^^^^^^^^^^^^^ source.kotlin meta.class.kotlin entity.name.class.kotlin
//                           ^ source.kotlin meta.class.kotlin punctuation.bracket.angle.begin.kotlin
//                            ^ source.kotlin meta.class.kotlin entity.name.type.class.kotlin
//                             ^ source.kotlin meta.class.kotlin punctuation.bracket.angle.end.kotlin
//                               ^ source.kotlin meta.class.kotlin punctuation.section.group.begin.kotlin
    copy fun add(element: T)
//  ^^^^ source.kotlin meta.class.kotlin storage.type.kotlin
//       ^^^ source.kotlin meta.class.kotlin meta.function.kotlin keyword.other.kotlin
//           ^^^ source.kotlin meta.class.kotlin meta.function.kotlin entity.name.function.kotlin
//              ^ source.kotlin meta.class.kotlin meta.function.kotlin punctuation.section.group.begin.kotlin punctuation.definition.parameters.begin.kotlin
//               ^^^^^^^ source.kotlin meta.class.kotlin meta.function.kotlin variable.parameter.function.kotlin
//                      ^ source.kotlin meta.class.kotlin meta.function.kotlin keyword.operator.declaration.kotlin
//                        ^ source.kotlin meta.class.kotlin meta.function.kotlin
//                         ^ source.kotlin meta.class.kotlin meta.function.kotlin punctuation.section.group.end.kotlin punctuation.definition.parameters.end.kotlin
}
// <- source.kotlin meta.class.kotlin punctuation.section.group.end.kotlin

value class State(
// <----------- source.kotlin meta.class.kotlin storage.modifier.kotlin
//          ^^^^^ source.kotlin meta.class.kotlin entity.name.class.kotlin
//               ^ source.kotlin meta.class.kotlin punctuation.section.group.begin.kotlin punctuation.definition.parameters.begin.kotlin
    copy var lastUpdate: Instant,
//  ^^^^ source.kotlin meta.class.kotlin meta.parameters.kotlin storage.type.kotlin
//       ^^^ source.kotlin meta.class.kotlin meta.parameters.kotlin storage.type.kotlin
//           ^^^^^^^^^^ source.kotlin meta.class.kotlin meta.parameters.kotlin variable.parameter.function.kotlin
//                     ^ source.kotlin meta.class.kotlin meta.parameters.kotlin  keyword.operator.declaration.kotlin
//                       ^^^^^^^ source.kotlin meta.class.kotlin meta.parameters.kotlin  entity.name.type.class.kotlin
//                              ^ source.kotlin meta.class.kotlin meta.parameters.kotlin punctuation.seperator.kotlin
)
// <- source.kotlin meta.class.kotlin punctuation.section.group.end.kotlin punctuation.definition.parameters.end.kotlin