// SYNTAX TEST "source.kotlin" "Double slash in strings is sometimes detected as a comment"

>class Rawkuma : WPMangaStream("Rawkuma", "https://rawkuma.com/", "ja") {
#^^^^^ source.kotlin meta.class.kotlin storage.modifier.kotlin
#     ^ source.kotlin meta.class.kotlin
#      ^^^^^^^ source.kotlin meta.class.kotlin entity.name.class.kotlin
#             ^^^ source.kotlin meta.class.kotlin
#                ^^^^^^^^^^^^^ source.kotlin meta.class.kotlin entity.name.type.class.kotlin
#                             ^ source.kotlin meta.class.kotlin meta.parameters.kotlin punctuation.section.group.begin.kotlin punctuation.definition.parameters.begin.kotlin
#                              ^ source.kotlin meta.class.kotlin meta.parameters.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
#                               ^^^^^^^ source.kotlin meta.class.kotlin meta.parameters.kotlin string.quoted.double.kotlin
#                                      ^ source.kotlin meta.class.kotlin meta.parameters.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
#                                       ^ source.kotlin meta.class.kotlin meta.parameters.kotlin punctuation.seperator.kotlin
#                                        ^ source.kotlin meta.class.kotlin meta.parameters.kotlin
#                                         ^ source.kotlin meta.class.kotlin meta.parameters.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
#                                          ^^^^^^^^^^^^^^^^^^^^ source.kotlin meta.class.kotlin meta.parameters.kotlin string.quoted.double.kotlin
#                                                              ^ source.kotlin meta.class.kotlin meta.parameters.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
#                                                               ^ source.kotlin meta.class.kotlin meta.parameters.kotlin punctuation.seperator.kotlin
#                                                                ^ source.kotlin meta.class.kotlin meta.parameters.kotlin
#                                                                 ^ source.kotlin meta.class.kotlin meta.parameters.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
#                                                                  ^^ source.kotlin meta.class.kotlin meta.parameters.kotlin string.quoted.double.kotlin
#                                                                    ^ source.kotlin meta.class.kotlin meta.parameters.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
#                                                                     ^ source.kotlin meta.class.kotlin meta.parameters.kotlin punctuation.section.group.end.kotlin punctuation.definition.parameters.end.kotlin
#                                                                      ^ source.kotlin meta.class.kotlin
#                                                                       ^ source.kotlin meta.class.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
>    private val rateLimitInterceptor = RateLimitInterceptor(4)
#^^^^ source.kotlin meta.class.kotlin meta.block.kotlin
#    ^^^^^^^ source.kotlin meta.class.kotlin meta.block.kotlin storage.modifier.kotlin
#           ^ source.kotlin meta.class.kotlin meta.block.kotlin
#            ^^^ source.kotlin meta.class.kotlin meta.block.kotlin storage.type.kotlin
#               ^^^^^^^^^^^^^^^^^^^^^^ source.kotlin meta.class.kotlin meta.block.kotlin
#                                     ^ source.kotlin meta.class.kotlin meta.block.kotlin keyword.operator.assignment.kotlin
#                                      ^ source.kotlin meta.class.kotlin meta.block.kotlin
#                                       ^^^^^^^^^^^^^^^^^^^^ source.kotlin meta.class.kotlin meta.block.kotlin entity.name.type.class.kotlin
#                                                           ^ source.kotlin meta.class.kotlin meta.block.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
#                                                            ^ source.kotlin meta.class.kotlin meta.block.kotlin meta.group.kotlin constant.numeric.integer.kotlin
#                                                             ^ source.kotlin meta.class.kotlin meta.block.kotlin meta.group.kotlin punctuation.section.group.end.kotlin
>}
#^ source.kotlin meta.class.kotlin meta.block.kotlin punctuation.section.group.end.kotlin