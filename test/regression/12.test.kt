// SYNTAX TEST "source.kotlin" "@ in string templates"
val name = "More specific name: `${this@SomeClass.id}`"
//<--- source.kotlin storage.type.kotlin
//       ^ source.kotlin keyword.operator.assignment.kotlin
//         ^ source.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin string.quoted.double.kotlin
//                                     ^^^^^^^^^^^^^^^^ -meta.declaration.annotation.kotlin
//                                                    ^ source.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
