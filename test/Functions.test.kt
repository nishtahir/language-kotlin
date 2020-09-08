// SYNTAX TEST "source.kotlin" "Function Declaration"

  fun main(@NonNull args: Array<String>) {
//^^^ keyword.other.kotlin
//    ^^^^ entity.name.function.kotlin
//        ^ meta.parameters.kotlin punctuation.section.group.begin.kotlin punctuation.definition.parameters.begin.kotlin
//         ^^^^^^^^ meta.parameters.kotlin meta.annotation.kotlin
//                 ^ meta.parameters.kotlin
//                  ^^^^ meta.parameters.kotlin variable.parameter.function.kotlin
//                      ^ meta.parameters.kotlin keyword.operator.declaration.kotlin
//                        ^^^^^ meta.parameters.kotlin support.class.kotlin
//                              ^^^^^^ meta.parameters.kotlin support.class.kotlin
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