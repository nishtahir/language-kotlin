// SYNTAX TEST "source.kotlin" "Greater than or equal should not be treated as generic"

if (num <= 10) {
//<-- source.kotlin keyword.control.conditional.kotlin
// ^ source.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//      ^^ keyword.operator.comparison.kotlin
//           ^ meta.group.kotlin punctuation.section.group.end.kotlin
//             ^ punctuation.section.group.begin.kotlin
  errors["num"] = "Something is wrong"
//      ^ punctuation.section.brackets.begin.kotlin
//       ^ punctuation.definition.string.begin.kotlin
//        ^^^ string.quoted.double.kotlin
//           ^ punctuation.definition.string.end.kotlin
//            ^ punctuation.section.brackets.end.kotlin
//              ^ keyword.operator.assignment.kotlin
//                ^ punctuation.definition.string.begin.kotlin
//                  ^^^^^^^^^^^^^^^^^ string.quoted.double.kotlin
//                                   ^ punctuation.definition.string.end.kotlin
}
//<- punctuation.section.group.end.kotlin
