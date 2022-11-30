// SYNTAX TEST "source.kotlin" "Recognize inner modifier"

>class Outer {
#^^^^^ source.kotlin meta.class.kotlin storage.modifier.kotlin
#     ^ source.kotlin meta.class.kotlin
#      ^^^^^ source.kotlin meta.class.kotlin entity.name.class.kotlin
#           ^ source.kotlin meta.class.kotlin
#            ^ source.kotlin meta.class.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
>    inner class Inner {}
#^^^^ source.kotlin meta.class.kotlin meta.block.kotlin
#    ^^^^^ source.kotlin meta.class.kotlin meta.block.kotlin storage.modifier.kotlin
#         ^ source.kotlin meta.class.kotlin meta.block.kotlin
#          ^^^^^ source.kotlin meta.class.kotlin meta.block.kotlin meta.class.kotlin storage.modifier.kotlin
#               ^ source.kotlin meta.class.kotlin meta.block.kotlin meta.class.kotlin
#                ^^^^^ source.kotlin meta.class.kotlin meta.block.kotlin meta.class.kotlin entity.name.class.kotlin
#                     ^ source.kotlin meta.class.kotlin meta.block.kotlin meta.class.kotlin
#                      ^ source.kotlin meta.class.kotlin meta.block.kotlin meta.class.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
#                       ^ source.kotlin meta.class.kotlin meta.block.kotlin meta.class.kotlin meta.block.kotlin punctuation.section.group.end.kotlin
>}
#^ source.kotlin meta.class.kotlin meta.block.kotlin punctuation.section.group.end.kotlin