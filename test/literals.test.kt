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

  val ubyte: UByte = 1u
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^^ source.kotlin
//         ^ source.kotlin keyword.operator.declaration.kotlin
//           ^^^^^ source.kotlin support.class.kotlin
//                 ^ source.kotlin keyword.operator.assignment.kotlin
//                   ^^ constant.numeric.integer.kotlin

  val ushort: UShort = 1u
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^^^ source.kotlin
//          ^ source.kotlin keyword.operator.declaration.kotlin
//            ^^^^^^ source.kotlin support.class.kotlin
//                   ^ source.kotlin keyword.operator.assignment.kotlin
//                     ^^ constant.numeric.integer.kotlin

  val uint: UInt = 1u
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^ source.kotlin
//        ^ source.kotlin keyword.operator.declaration.kotlin
//          ^^^^ source.kotlin support.class.kotlin
//               ^ source.kotlin keyword.operator.assignment.kotlin
//                 ^^ constant.numeric.integer.kotlin

  val ulong: ULong = 42u
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^^ source.kotlin
//         ^ source.kotlin keyword.operator.declaration.kotlin
//           ^^^^^ source.kotlin support.class.kotlin
//                 ^ source.kotlin keyword.operator.assignment.kotlin
//                   ^^ constant.numeric.integer.kotlin

  val hexUlong = 0xFFFF_FFFF_FFFFu
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^^^^^ source.kotlin
//             ^ source.kotlin keyword.operator.assignment.kotlin
//               ^^^^^^^^^^^^^^^^^ constant.numeric.hex.kotlin

  listOf(0b0u, 0b1U, 0b10uL, 0b11UL, 4u, 5U, 6uL, 7UL, 0x8u, 0x9U, 0xauL, 0xbUL)
//^^^^^^ source.kotlin support.function.kotlin
//       ^^^^ constant.numeric.binary.kotlin
//             ^^^^ constant.numeric.binary.kotlin
//                    ^^^^^ constant.numeric.binary.kotlin
//                           ^^^^^ constant.numeric.binary.kotlin
//                                   ^^ constant.numeric.integer.kotlin
//                                       ^^ constant.numeric.integer.kotlin
//                                           ^^^ constant.numeric.integer.kotlin
//                                                ^^^ constant.numeric.integer.kotlin
//                                                     ^^^^ constant.numeric.hex.kotlin
//                                                           ^^^^ constant.numeric.hex.kotlin
//                                                                 ^^^^^ constant.numeric.hex.kotlin
//                                                                        ^^^^^ constant.numeric.hex.kotlin

  val unicodeEscape = "\u3400"
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^^^^^^^^^^^ source.kotlin
//                  ^ source.kotlin keyword.operator.assignment.kotlin
//                   ^ source.kotlin
//                    ^ source.kotlin string.quoted.double.kotlin punctuation.definition.string.begin.kotlin
//                     ^^^^^^ source.kotlin string.quoted.double.kotlin constant.character.escape.unicode.kotlin
//                           ^ source.kotlin string.quoted.double.kotlin punctuation.definition.string.end.kotlin