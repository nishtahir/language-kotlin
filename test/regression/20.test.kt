# SYNTAX TEST "source.kotlin" "Kotlin nested multi-line comments syntax-highlighting"

 /*
#^^ source.kotlin comment.block.kotlin punctuation.definition.comment.begin.kotlin
      This is inside the comment
#^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin comment.block.kotlin
     /*
#^^^^ source.kotlin comment.block.kotlin
#    ^^ source.kotlin comment.block.kotlin
         You can insert something here.
#^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin comment.block.kotlin
     */
#^^^^ source.kotlin comment.block.kotlin
#    ^^ source.kotlin comment.block.kotlin
      This is a comment since the nested comment is parsed correctly.
#^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin comment.block.kotlin
 */
#^^ source.kotlin comment.block.kotlin punctuation.definition.comment.end.kotlin