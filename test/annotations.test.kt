// SYNTAX TEST "source.kotlin" "Annotations"

  @file:JvmName("Foo")
//^^^^^^^^^^^^^^^^^^^^ meta.annotation.kotlin
//^^^^^^^^^^^^^ storage.type.annotation.kotlin
//             ^ punctuation.definition.arguments.begin.kotlin
//              ^ meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//               ^^^ meta.annotation.kotlin string.quoted.double.kotlin
//                  ^ meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                   ^ meta.annotation.kotlin punctuation.definition.arguments.end.kotlin

data class Response(@SerializedName("param1") val param1: String,
//                  ^^^^^^^^^^^^^^^ meta.class.kotlin meta.parameters.kotlin storage.type.annotation.kotlin
//                                 ^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin punctuation.definition.arguments.begin.kotlin
//                                  ^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                                   ^^^^^^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin
//                                         ^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                                          ^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin punctuation.definition.arguments.end.kotlin
//                                            ^^^ meta.class.kotlin meta.parameters.kotlin storage.type.kotlin
//                                                ^^^^^^ meta.class.kotlin meta.parameters.kotlin variable.parameter.function.kotlin
//                                                      ^ meta.class.kotlin meta.parameters.kotlin keyword.operator.declaration.kotlin
//                                                        ^^^^^^ meta.class.kotlin meta.parameters.kotlin support.class.kotlin
//                                                              ^ meta.class.kotlin meta.parameters.kotlin punctuation.seperator.kotlin

                    @SerializedName("param2") val param2: String,
//                  ^^^^^^^^^^^^^^^ meta.class.kotlin meta.parameters.kotlin storage.type.annotation.kotlin
//                                 ^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin punctuation.definition.arguments.begin.kotlin
//                                  ^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                                   ^^^^^^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin
//                                         ^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                                          ^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin punctuation.definition.arguments.end.kotlin
//                                            ^^^ meta.class.kotlin meta.parameters.kotlin storage.type.kotlin
//                                                ^^^^^^ meta.class.kotlin meta.parameters.kotlin variable.parameter.function.kotlin
//                                                      ^ meta.class.kotlin meta.parameters.kotlin keyword.operator.declaration.kotlin
//                                                        ^^^^^^ meta.class.kotlin meta.parameters.kotlin support.class.kotlin
//                                                              ^ meta.class.kotlin meta.parameters.kotlin punctuation.seperator.kotlin
                    @SerializedName("param3") val param3: String) {
//                  ^^^^^^^^^^^^^^^ meta.class.kotlin meta.parameters.kotlin storage.type.annotation.kotlin
//                                 ^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin punctuation.definition.arguments.begin.kotlin
//                                  ^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                                   ^^^^^^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin
//                                         ^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                                          ^ meta.class.kotlin meta.parameters.kotlin meta.annotation.kotlin punctuation.definition.arguments.end.kotlin
//                                            ^^^ meta.class.kotlin meta.parameters.kotlin storage.type.kotlin
//                                                ^^^^^^ meta.class.kotlin meta.parameters.kotlin variable.parameter.function.kotlin
//                                                      ^ meta.class.kotlin meta.parameters.kotlin keyword.operator.declaration.kotlin
//                                                        ^^^^^^ meta.class.kotlin meta.parameters.kotlin support.class.kotlin
//                                                              ^ meta.class.kotlin meta.parameters.kotlin punctuation.section.group.end.kotlin punctuation.definition.parameters.end.kotlin
//                                                                ^ meta.class.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
}

class Example {
    @set:Inject
//  ^^^^^^^^^^^ storage.type.annotation.kotlin
    var collaborator: Collaborator
}


  @MultiLineAnnotation(
//^^^^^^^^^^^^^^^^^^^^ meta.annotation.kotlin storage.type.annotation.kotlin
//                    ^ meta.annotation.kotlin punctuation.definition.arguments.begin.kotlin
      "One",
//    ^ meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//     ^^^ meta.annotation.kotlin string.quoted.double.kotlin
//        ^ meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//         ^ meta.annotation.kotlin punctuation.seperator.kotlin
      "Two",
//    ^ meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//     ^^^ meta.annotation.kotlin string.quoted.double.kotlin
//        ^ meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//         ^ meta.annotation.kotlin punctuation.seperator.kotlin
      "Three",
//    ^ meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//     ^^^^^ meta.annotation.kotlin string.quoted.double.kotlin
//          ^ meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//           ^ meta.annotation.kotlin punctuation.seperator.kotlin
      "Four",
//    ^ meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//     ^^^^ meta.annotation.kotlin string.quoted.double.kotlin
//         ^ meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//          ^ meta.annotation.kotlin punctuation.seperator.kotlin
      "Five",
//    ^ meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//     ^^^^ meta.annotation.kotlin string.quoted.double.kotlin
//         ^ meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//          ^ meta.annotation.kotlin punctuation.seperator.kotlin
  )
//^ meta.annotation.kotlin punctuation.definition.arguments.end.kotlin