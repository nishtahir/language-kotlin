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