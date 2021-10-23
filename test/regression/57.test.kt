// SYNTAX TEST "source.kotlin" "Keywords"

"outside string ${ /*Comment*/ "inside string ${ "string in code block" } " + someFunction() }"
# <- string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
#               ^^ string.quoted.double.kotlin entity.string.template.element.kotlin punctuation.section.block.start.kotlin
#                  ^^ string.quoted.double.kotlin entity.string.template.element.kotlin comment.block.kotlin punctuation.definition.comment.begin.kotlin 
#                    ^^^^^^^ string.quoted.double.kotlin entity.string.template.element.kotlin comment.block.kotlin
#                           ^^ string.quoted.double.kotlin entity.string.template.element.kotlin comment.block.kotlin punctuation.definition.comment.end.kotlin
#                              ^ string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
#                                             ^^ string.quoted.double.kotlin entity.string.template.element.kotlin punctuation.section.block.start.kotlin
#                                                ^ string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
#                                                                     ^ string.quoted.double.kotlin punctuation.definition.string.end.kotlin
#                                                                       ^ string.quoted.double.kotlin entity.string.template.element.kotlin punctuation.section.block.end.kotlin
#                                                                         ^ string.quoted.double.kotlin punctuation.definition.string.end.kotlin
#                                                                           ^ keyword.operator.increment-decrement.kotlin kotlin
#                                                                                         ^ punctuation.section.group.begin.kotlin
#                                                                                          ^ punctuation.section.group.end.kotlin
#                                                                                            ^ string.quoted.double.kotlin entity.string.template.element.kotlin punctuation.section.block.end.kotlin
#                                                                                             ^ string.quoted.double.kotlin punctuation.definition.string.end.kotlin

"""${someFunction()}"""
# <--- string.quoted.triple.kotlin punctuation.definition.string.begin.kotlin
#  ^^string.quoted.triple.kotlin entity.string.template.element.kotlin punctuation.section.block.start.kotlin
#                  ^ string.quoted.triple.kotlin entity.string.template.element.kotlin punctuation.section.block.end.kotlin
#                   ^^^ string.quoted.triple.kotlin punctuation.definition.string.end.kotlin