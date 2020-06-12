// SYNTAX TEST "source.kotlin" "Annotations"

@file:JvmName("Foo")
//<------------- meta.annotation.kotlin
//           ^ punctuation.section.group.begin.kotlin
//            ^ source.kotlin meta.group.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//             ^^^ source.kotlin meta.group.kotlin string.quoted.double.kotlin
//                ^ source.kotlin meta.group.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                 ^ source.kotlin meta.group.kotlin punctuation.section.group.end.kotlin

data class Response(@SerializedName("param1") val param1: String,
//                  ^^^^^^^^^^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin
//                                 ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin punctuation.definition.arguments.begin.kotlin
//                                  ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                                   ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin string.quoted.double.kotlin
//                                         ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                                          ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin punctuation.definition.arguments.end.kotlin
//                                            ^^^ source.kotlin meta.class.kotlin meta.group.kotlin storage.type.kotlin
//                                                ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin variable.parameter.function.kotlin
//                                                      ^ source.kotlin meta.class.kotlin meta.group.kotlin keyword.operator.declaration.kotlin
//                                                        ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin support.class.kotlin
//                                                              ^ source.kotlin meta.class.kotlin meta.group.kotlin punctuation.seperator.kotlin

                    @SerializedName("param2") val param2: String,
//                  ^^^^^^^^^^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin
//                                 ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin punctuation.definition.arguments.begin.kotlin
//                                  ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                                   ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin string.quoted.double.kotlin
//                                         ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                                          ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin punctuation.definition.arguments.end.kotlin
//                                            ^^^ source.kotlin meta.class.kotlin meta.group.kotlin storage.type.kotlin
//                                                ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin variable.parameter.function.kotlin
//                                                      ^ source.kotlin meta.class.kotlin meta.group.kotlin keyword.operator.declaration.kotlin
//                                                        ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin support.class.kotlin
//                                                              ^ source.kotlin meta.class.kotlin meta.group.kotlin punctuation.seperator.kotlin
                    @SerializedName("param3") val param3: String) {
//                  ^^^^^^^^^^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin
//                                 ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin punctuation.definition.arguments.begin.kotlin
//                                  ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                                   ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin string.quoted.double.kotlin
//                                         ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                                          ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.annotation.kotlin punctuation.definition.arguments.end.kotlin
//                                            ^^^ source.kotlin meta.class.kotlin meta.group.kotlin storage.type.kotlin
//                                                ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin variable.parameter.function.kotlin
//                                                      ^ source.kotlin meta.class.kotlin meta.group.kotlin keyword.operator.declaration.kotlin
//                                                        ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin support.class.kotlin
//                                                              ^ source.kotlin meta.class.kotlin meta.group.kotlin punctuation.section.group.end.kotlin
//                                                                ^ source.kotlin meta.class.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
}

class Example {
    @set:Inject
//  ^^^^^^^^^^^ source.kotlin meta.annotation.kotlin
    var collaborator: Collaborator
}


  @MultiLineAnnotation(
//^^^^^^^^^^^^^^^^^^^^ source.kotlin meta.annotation.kotlin
//                    ^ source.kotlin meta.annotation.kotlin punctuation.definition.arguments.begin.kotlin
      "One",
//    ^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//     ^^^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin
//        ^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//         ^ source.kotlin meta.annotation.kotlin punctuation.seperator.kotlin
      "Two",
//    ^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//     ^^^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin
//        ^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//         ^ source.kotlin meta.annotation.kotlin punctuation.seperator.kotlin
      "Three",
//    ^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//     ^^^^^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin
//          ^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//           ^ source.kotlin meta.annotation.kotlin punctuation.seperator.kotlin
      "Four",
//    ^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//     ^^^^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin
//         ^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//          ^ source.kotlin meta.annotation.kotlin punctuation.seperator.kotlin
      "Five",
//    ^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//     ^^^^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin
//         ^ source.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//          ^ source.kotlin meta.annotation.kotlin punctuation.seperator.kotlin
  )
//^ source.kotlin meta.annotation.kotlin punctuation.definition.arguments.end.kotlin