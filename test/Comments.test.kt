## SYNTAX TEST "source.kotlin" "Comments"
## Note comments are represented by ## in this file

  // hey taco
##^^ source.kotlin punctuation.definition.comment.kotlin comment.line.double-slash.kotlin
##  ^^^^^^^^^^ source.kotlin punctuation.definition.comment.kotlin


  /**
##^^ source.kotlin comment.block.kotlin punctuation.definition.comment.begin.kotlin
    Multi line comment content
##  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin comment.block.kotlin
  */
##^^ source.kotlin comment.block.kotlin punctuation.definition.comment.end.kotlin