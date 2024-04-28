// SYNTAX TEST "source.kotlin" "Imports"

  import com.google.test.ClassName as Test
//^^^^^^ source.kotlin meta.import.kotlin keyword.other.import.kotlin
//      ^ source.kotlin meta.import.kotlin
//       ^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin meta.import.kotlin storage.modifier.import.kotlin
//                                ^ source.kotlin meta.import.kotlin
//                                 ^^ source.kotlin meta.import.kotlin keyword.other.kotlin
//                                   ^ source.kotlin meta.import.kotlin
//                                    ^^^^^ source.kotlin meta.import.kotlin entity.name.type

  import Interpreter
//^^^^^^ source.kotlin meta.import.kotlin keyword.other.import.kotlin
//      ^ source.kotlin meta.import.kotlin
//       ^^^^^^^^^^^ source.kotlin meta.import.kotlin storage.modifier.import.kotlin

  import `Testing Module`.StringTester as STester
//^^^^^^ source.kotlin meta.import.kotlin keyword.other.import.kotlin
//      ^ source.kotlin meta.import.kotlin
//       ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin meta.import.kotlin storage.modifier.import.kotlin
//                                    ^ source.kotlin meta.import.kotlin
//                                     ^^ source.kotlin meta.import.kotlin keyword.other.kotlin
//                                       ^ source.kotlin meta.import.kotlin
//                                        ^^^^^^^ source.kotlin meta.import.kotlin entity.name.type

  import Test.`take String as CharSequence` as take
//^^^^^^ source.kotlin meta.import.kotlin keyword.other.import.kotlin
//      ^ source.kotlin meta.import.kotlin
//       ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin meta.import.kotlin storage.modifier.import.kotlin
//                         ^^ - keyword.other.kotlin
//                                         ^ source.kotlin meta.import.kotlin
//                                          ^^ source.kotlin meta.import.kotlin keyword.other.kotlin
//                                            ^ source.kotlin meta.import.kotlin
//                                             ^^^^ source.kotlin meta.import.kotlin entity.name.type

  import com.google.test.CommentedClass // comment
//^^^^^^ source.kotlin meta.import.kotlin keyword.other.import.kotlin
//      ^ source.kotlin meta.import.kotlin
//       ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin meta.import.kotlin storage.modifier.import.kotlin
//                                      ^^ source.kotlin punctuation.definition.comment.kotlin comment.line.double-slash.kotlin

  import com.google.test.CommentedClass /*comment*/ as Another
//^^^^^^ source.kotlin meta.import.kotlin keyword.other.import.kotlin
//      ^ source.kotlin meta.import.kotlin
//       ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ source.kotlin meta.import.kotlin storage.modifier.import.kotlin
//                                      ^^ source.kotlin comment.block.kotlin punctuation.definition.comment.begin.kotlin
//                                               ^^ source.kotlin comment.block.kotlin punctuation.definition.comment.end.kotlin
//                                                 ^ source.kotlin
//                                                  ^^ source.kotlin keyword.operator.kotlin
//                                                    ^ source.kotlin
//                                                     ^^^^^^^ source.kotlin entity.name.type.class.kotlin