// SYNTAX TEST "source.kotlin" "Annotations"

@file:JvmName("Foo")
//<------------- meta.declaration.annotation.kotlin storage.type.annotation.kotlin
//           ^ meta.declaration.annotation.kotlin punctuation.definition.annotation-arguments.begin.kotlin
//            ^ meta.declaration.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//             ^^^ meta.declaration.annotation.kotlin string.quoted.double.kotlin
//                ^ meta.declaration.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                 ^ meta.declaration.annotation.kotlin punctuation.definition.annotation-arguments.end.kotlin

data class Response(@SerializedName("param1") val param1: String,
//                  ^^^^^^^^^^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin storage.type.annotation.kotlin
//                                 ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin punctuation.definition.annotation-arguments.begin.kotlin
//                                  ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                                   ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin string.quoted.double.kotlin
//                                         ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                                          ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin punctuation.definition.annotation-arguments.end.kotlin
//                                            ^^^ source.kotlin meta.class.kotlin meta.group.kotlin storage.type.kotlin
//                                                ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin variable.parameter.function.kotlin
//                                                      ^ source.kotlin meta.class.kotlin meta.group.kotlin keyword.operator.declaration.kotlin
//                                                        ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin support.class.kotlin
//                                                              ^ source.kotlin meta.class.kotlin meta.group.kotlin punctuation.seperator.kotlin

                    @SerializedName("param2") val param2: String,
//                  ^^^^^^^^^^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin storage.type.annotation.kotlin
//                                 ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin punctuation.definition.annotation-arguments.begin.kotlin
//                                  ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                                   ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin string.quoted.double.kotlin
//                                         ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                                          ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin punctuation.definition.annotation-arguments.end.kotlin
//                                            ^^^ source.kotlin meta.class.kotlin meta.group.kotlin storage.type.kotlin
//                                                ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin variable.parameter.function.kotlin
//                                                      ^ source.kotlin meta.class.kotlin meta.group.kotlin keyword.operator.declaration.kotlin
//                                                        ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin support.class.kotlin
//                                                              ^ source.kotlin meta.class.kotlin meta.group.kotlin punctuation.seperator.kotlin
                    @SerializedName("param3") val param3: String) {
//                  ^^^^^^^^^^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin storage.type.annotation.kotlin
//                                 ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin punctuation.definition.annotation-arguments.begin.kotlin
//                                  ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                                   ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin string.quoted.double.kotlin
//                                         ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                                          ^ source.kotlin meta.class.kotlin meta.group.kotlin meta.declaration.annotation.kotlin punctuation.definition.annotation-arguments.end.kotlin
//                                            ^^^ source.kotlin meta.class.kotlin meta.group.kotlin storage.type.kotlin
//                                                ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin variable.parameter.function.kotlin
//                                                      ^ source.kotlin meta.class.kotlin meta.group.kotlin keyword.operator.declaration.kotlin
//                                                        ^^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin support.class.kotlin
//                                                              ^ source.kotlin meta.class.kotlin meta.group.kotlin punctuation.section.group.end.kotlin
//                                                                ^ source.kotlin meta.class.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
}