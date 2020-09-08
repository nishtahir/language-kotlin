## SYNTAX TEST "source.kotlin" "Comments in function parameters are not scoped correctly"

  fun setNodeIpAddress(
##^^^ meta.function.kotlin keyword.other.kotlin
##   ^ meta.function.kotlin
##    ^^^^^^^^^^^^^^^^ meta.function.kotlin entity.name.function.kotlin
##                    ^ meta.function.kotlin meta.parameters.kotlin punctuation.section.group.begin.kotlin punctuation.definition.parameters.begin.kotlin
    @Param("str") value: String,
##^^ meta.function.kotlin meta.parameters.kotlin
##  ^^^^^^ meta.function.kotlin meta.parameters.kotlin meta.annotation.kotlin
##        ^ meta.function.kotlin meta.parameters.kotlin meta.annotation.kotlin punctuation.definition.arguments.begin.kotlin
##         ^ meta.function.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
##          ^^^ meta.function.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin
##             ^ meta.function.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
##              ^ meta.function.kotlin meta.parameters.kotlin meta.annotation.kotlin punctuation.definition.arguments.end.kotlin
##               ^ meta.function.kotlin meta.parameters.kotlin
##                ^^^^^ meta.function.kotlin meta.parameters.kotlin variable.parameter.function.kotlin
##                     ^ meta.function.kotlin meta.parameters.kotlin keyword.operator.declaration.kotlin
##                      ^ meta.function.kotlin meta.parameters.kotlin
##                       ^^^^^^ meta.function.kotlin meta.parameters.kotlin support.class.kotlin
##                             ^ meta.function.kotlin meta.parameters.kotlin punctuation.seperator.kotlin
    // @Param("str) value: String,
##^^ meta.function.kotlin meta.parameters.kotlin
##  ^^ meta.function.kotlin meta.parameters.kotlin punctuation.definition.comment.kotlin comment.line.double-slash.kotlin
##    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ meta.function.kotlin meta.parameters.kotlin punctuation.definition.comment.kotlin
    @Param("str") value: String,
##^^ meta.function.kotlin meta.parameters.kotlin
##  ^^^^^^ meta.function.kotlin meta.parameters.kotlin meta.annotation.kotlin
##        ^ meta.function.kotlin meta.parameters.kotlin meta.annotation.kotlin punctuation.definition.arguments.begin.kotlin
##         ^ meta.function.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
##          ^^^ meta.function.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin
##             ^ meta.function.kotlin meta.parameters.kotlin meta.annotation.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
##              ^ meta.function.kotlin meta.parameters.kotlin meta.annotation.kotlin punctuation.definition.arguments.end.kotlin
##               ^ meta.function.kotlin meta.parameters.kotlin
##                ^^^^^ meta.function.kotlin meta.parameters.kotlin variable.parameter.function.kotlin
##                     ^ meta.function.kotlin meta.parameters.kotlin keyword.operator.declaration.kotlin
##                      ^ meta.function.kotlin meta.parameters.kotlin
##                       ^^^^^^ meta.function.kotlin meta.parameters.kotlin support.class.kotlin
##                             ^ meta.function.kotlin meta.parameters.kotlin punctuation.seperator.kotlin
  )
##^ meta.function.kotlin meta.parameters.kotlin punctuation.section.group.end.kotlin punctuation.definition.parameters.end.kotlin