// SYNTAX TEST "source.kotlin" "Literals"

   val test = true
// ^^^ storage.type.kotlin
//          ^ keyword.operator.assignment.kotlin
//            ^^^^ constant.language.boolean.kotlin
   val test = false
// ^^^ storage.type.kotlin
//          ^ keyword.operator.assignment.kotlin
//            ^^^^ constant.language.boolean.kotlin

  val oneMillion = 1_000_000
//^^^ storage.type.kotlin
//   ^^^^^^^^^^^^ source.kotlin
//               ^ keyword.operator.assignment.kotlin
//                ^ source.kotlin
//                 ^^^^^^^^^ constant.numeric.integer.kotlin
  val creditCardNumber = 1234_5678_9012_3456L
//^^^ storage.type.kotlin
//   ^^^^^^^^^^^^^^^^^^ source.kotlin
//                     ^ keyword.operator.assignment.kotlin
//                      ^ source.kotlin
//                       ^^^^^^^^^^^^^^^^^^^^ constant.numeric.integer.kotlin
  val socialSecurityNumber = 999_99_9999L
//^^^ storage.type.kotlin
//   ^^^^^^^^^^^^^^^^^^^^^^ source.kotlin
//                         ^ keyword.operator.assignment.kotlin
//                          ^ source.kotlin
//                           ^^^^^^^^^^^^ constant.numeric.integer.kotlin
  val hexBytes = 0xFF_EC_DE_5E
//^^^ storage.type.kotlin
//   ^^^^^^^^^^ source.kotlin
//             ^ keyword.operator.assignment.kotlin
//              ^ source.kotlin
//               ^^^^^^^^^^^^^ constant.numeric.hex.kotlin
  val float = 0.043_331F
//^^^ storage.type.kotlin
//   ^^^^^^^ source.kotlin
//          ^ keyword.operator.assignment.kotlin
//           ^ source.kotlin
//            ^^^^^^^^^^ constant.numeric.float.kotlin
  val bytes = 0b11010010_01101001_10010100_10010010
//^^^ storage.type.kotlin
//   ^^^^^^^ source.kotlin
//          ^ keyword.operator.assignment.kotlin
//           ^ source.kotlin
//            ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ constant.numeric.binary.kotlin


  val myString = "Hey there!"
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^^^^^^ source.kotlin
//             ^ source.kotlin keyword.operator.assignment.kotlin
//              ^ source.kotlin
//               ^ source.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                ^^^^^^^^^^ source.kotlin string.quoted.double.kotlin
//                          ^ source.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
  println("myString  = $myString")
//^^^^^^^ source.kotlin support.function.kotlin
//       ^ source.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//        ^ source.kotlin meta.group.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//         ^^^^^^^^^^^^^^^^^^^^^ source.kotlin meta.group.kotlin string.quoted.double.kotlin
//                              ^ source.kotlin meta.group.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                               ^ source.kotlin meta.group.kotlin punctuation.section.group.end.kotlin

  val myString = "Hey there!\n"
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^^^^^^ source.kotlin
//             ^ source.kotlin keyword.operator.assignment.kotlin
//              ^ source.kotlin
//               ^ source.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                ^^^^^^^^^^ source.kotlin string.quoted.double.kotlin
//                          ^^ source.kotlin string.quoted.double.kotlin constant.character.escape.kotlin
//                            ^ source.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin

  val myString = """
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^^^^^^ source.kotlin
//             ^ source.kotlin keyword.operator.assignment.kotlin
//              ^ source.kotlin
//               ^^^ source.kotlin string.quoted.triple.kotlin punctuation.definition.string.begin.kotlin
      for (character in "Hey!")
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin string.quoted.triple.kotlin
          println(character)
//^^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin string.quoted.triple.kotlin
  """
//^^^ source.kotlin string.quoted.triple.kotlin punctuation.definition.string.end.kotlin

  println("Length of s1 string is ${s1.length}.")
//^^^^^^^ source.kotlin support.function.kotlin
//       ^ source.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//        ^ source.kotlin meta.group.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//         ^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin meta.group.kotlin string.quoted.double.kotlin
//                                ^ source.kotlin meta.group.kotlin string.quoted.double.kotlin entity.string.template.element.kotlin
//                                 ^ source.kotlin meta.group.kotlin string.quoted.double.kotlin entity.string.template.element.kotlin punctuation.section.block.begin.kotlin
//                                  ^^ source.kotlin meta.group.kotlin string.quoted.double.kotlin entity.string.template.element.kotlin
//                                     ^^^^^^ source.kotlin meta.group.kotlin string.quoted.double.kotlin entity.string.template.element.kotlin
//                                           ^ source.kotlin meta.group.kotlin string.quoted.double.kotlin entity.string.template.element.kotlin punctuation.section.block.end.kotlin
//                                            ^ source.kotlin meta.group.kotlin string.quoted.double.kotlin
//                                             ^ source.kotlin meta.group.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin
//                                              ^ source.kotlin meta.group.kotlin punctuation.section.group.end.kotlin

  val test = null
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^^ source.kotlin
//         ^ source.kotlin keyword.operator.assignment.kotlin
//          ^ source.kotlin
//           ^^^^ source.kotlin constant.language.null.kotlin