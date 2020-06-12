// SYNTAX TEST "source.kotlin" "Comments after field"

data class A(
//<---- source.kotlin storage.type.kotlin
//   ^^^^^ source.kotlin meta.class.kotlin storage.modifier.kotlin
//         ^ source.kotlin meta.class.kotlin entity.name.class.kotlin
//          ^ source.kotlin meta.class.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
  val field: Int  // This is a comment, when is not a keyword
//^^^ source.kotlin meta.class.kotlin meta.group.kotlin storage.type.kotlin
//    ^^^^^ source.kotlin meta.class.kotlin meta.group.kotlin variable.parameter.function.kotlin
//         ^ source.kotlin meta.class.kotlin meta.group.kotlin keyword.operator.declaration.kotlin
//           ^^^ source.kotlin meta.class.kotlin meta.group.kotlin support.class.kotlin
//                ^^ punctuation.definition.comment.kotlin comment.line.double-slash.kotlin
//                ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ punctuation.definition.comment.kotlin
//                ^ -keyword.operator.arithmetic.kotlin
//                 ^ -keyword.operator.arithmetic.kotlin
)
//<- source.kotlin meta.class.kotlin meta.group.kotlin punctuation.section.group.end.kotlin

// This is a comment, when is not a keyword