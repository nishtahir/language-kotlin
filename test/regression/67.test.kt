// SYNTAX TEST "source.kotlin" "Triple-quoted strings do not ignore backslash before closing sequence"

>val cmd = """bash -c "sudo -u test bash --noprofile --norc -euo pipefail "\"""
#^^^ source.kotlin storage.type.kotlin
#   ^^^^^ source.kotlin
#        ^ source.kotlin keyword.operator.assignment.kotlin
#         ^ source.kotlin
#          ^^^ source.kotlin string.quoted.triple.kotlin punctuation.definition.string.begin.kotlin
#             ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin string.quoted.triple.kotlin
#                                                                           ^^^ source.kotlin string.quoted.triple.kotlin punctuation.definition.string.end.kotlin
>val num = 1
#^^^ source.kotlin storage.type.kotlin
#   ^^^^^ source.kotlin
#        ^ source.kotlin keyword.operator.assignment.kotlin
#         ^ source.kotlin
#          ^ source.kotlin constant.numeric.integer.kotlin
>