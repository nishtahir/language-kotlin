// SYNTAX TEST "source.kotlin" "Function Declaration"

  fun main(@NonNull args: Array<String>) {
//^^^ keyword.other.kotlin
//    ^^^^ entity.name.function.kotlin
//        ^ meta.parameters.kotlin punctuation.section.group.begin.kotlin punctuation.definition.parameters.begin.kotlin
//         ^^^^^^^^ meta.parameters.kotlin storage.type.annotation.kotlin
//                 ^ meta.parameters.kotlin
//                  ^^^^ meta.parameters.kotlin variable.parameter.function.kotlin
//                      ^ meta.parameters.kotlin keyword.operator.declaration.kotlin
//                        ^^^^^ meta.parameters.kotlin support.class.kotlin
//                             ^ punctuation.bracket.angle.begin.kotlin
//                              ^^^^^^ meta.parameters.kotlin support.class.kotlin
//                                    ^ punctuation.bracket.angle.end.kotlin
//                                     ^ meta.parameters.kotlin punctuation.section.group.end.kotlin
//                                       ^ meta.block.kotlin punctuation.section.group.begin.kotlin
      println("Hello Kotlin!")
//^^^^ meta.block.kotlin
//    ^^^^^^^ meta.block.kotlin support.function.kotlin
//           ^ meta.block.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//            ^ meta.block.kotlin meta.group.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//             ^^^^^^^^^^^^^ meta.block.kotlin meta.group.kotlin string.quoted.double.kotlin
//                          ^ meta.block.kotlin meta.group.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                           ^ meta.block.kotlin meta.group.kotlin punctuation.section.group.end.kotlin
  }
//^ meta.block.kotlin punctuation.section.group.end.kotlin
  
  
  fun `🌯`() {
//^^^ keyword.other.kotlin
//   ^ source.kotlin
//    ^^^^ entity.name.function.kotlin
//        ^ meta.parameters.kotlin punctuation.section.group.begin.kotlin
//         ^ meta.parameters.kotlin punctuation.section.group.end.kotlin
//           ^ meta.block.kotlin punctuation.section.group.begin.kotlin
      println("Hello Kotlin!")
//^^^^ meta.block.kotlin
//    ^^^^^^^ meta.block.kotlin support.function.kotlin
//           ^ meta.block.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//            ^ meta.block.kotlin meta.group.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//             ^^^^^^^^^^^^^ meta.block.kotlin meta.group.kotlin string.quoted.double.kotlin
//                          ^ meta.block.kotlin meta.group.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                           ^ meta.block.kotlin meta.group.kotlin punctuation.section.group.end.kotlin
  }
//^ meta.block.kotlin punctuation.section.group.end.kotlin

  fun foo(): String? {
//^^^ source.kotlin meta.function.kotlin keyword.other.kotlin
//   ^ source.kotlin meta.function.kotlin
//    ^^^ source.kotlin meta.function.kotlin entity.name.function.kotlin
//       ^ source.kotlin meta.function.kotlin meta.parameters.kotlin punctuation.section.group.begin.kotlin punctuation.definition.parameters.begin.kotlin
//        ^ source.kotlin meta.function.kotlin meta.parameters.kotlin punctuation.section.group.end.kotlin punctuation.definition.parameters.end.kotlin
//           ^^^^^^^ source.kotlin meta.function.kotlin support.class.kotlin
//                   ^ source.kotlin meta.function.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
  }
//^ source.kotlin meta.function.kotlin meta.block.kotlin punctuation.section.group.end.kotlin

  val numbers = arrayListOf(1, 2, 3)
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^^^^^ source.kotlin
//            ^ source.kotlin keyword.operator.assignment.kotlin
//             ^ source.kotlin
//              ^^^^^^^^^^^ source.kotlin support.function.kotlin
//                         ^ source.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//                          ^ source.kotlin meta.group.kotlin constant.numeric.integer.kotlin
//                           ^ source.kotlin meta.group.kotlin punctuation.seperator.kotlin
//                            ^ source.kotlin meta.group.kotlin
//                             ^ source.kotlin meta.group.kotlin constant.numeric.integer.kotlin
//                              ^ source.kotlin meta.group.kotlin punctuation.seperator.kotlin
//                               ^ source.kotlin meta.group.kotlin
//                                ^ source.kotlin meta.group.kotlin constant.numeric.integer.kotlin
//                                 ^ source.kotlin meta.group.kotlin punctuation.section.group.end.kotlin