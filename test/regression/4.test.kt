// SYNTAX TEST "source.kotlin" "Comments after field"

data class A(
//<---- storage.type.kotlin
//   ^^^^^ meta.class.kotlin storage.modifier.kotlin
//         ^ meta.class.kotlin entity.name.class.kotlin
//          ^ meta.class.kotlin meta.parameters.kotlin punctuation.section.group.begin.kotlin punctuation.definition.parameters.begin.kotlin
  val field: Int  // This is a comment, when is not a keyword
//^^^ meta.class.kotlin meta.parameters.kotlin storage.type.kotlin
//    ^^^^^ meta.class.kotlin meta.parameters.kotlin variable.parameter.function.kotlin
//         ^ meta.class.kotlin meta.parameters.kotlin keyword.operator.declaration.kotlin
//           ^^^ meta.class.kotlin meta.parameters.kotlin support.class.kotlin
//                ^^ punctuation.definition.comment.kotlin comment.line.double-slash.kotlin
//                ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ punctuation.definition.comment.kotlin
//                ^ -keyword.operator.arithmetic.kotlin
//                 ^ -keyword.operator.arithmetic.kotlin
)
//<- meta.class.kotlin meta.parameters.kotlin punctuation.section.group.end.kotlin punctuation.definition.parameters.end.kotlin

// This is a comment, when is not a keyword