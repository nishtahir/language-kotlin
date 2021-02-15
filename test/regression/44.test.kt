// SYNTAX TEST "source.kotlin" "Keywords"

  val test = !isC
//^^^ source.kotlin storage.type.kotlin
//   ^^^^^^ source.kotlin
//         ^ source.kotlin keyword.operator.assignment.kotlin
//           ^ keyword.operator.logical.kotlin
//            ^^^ source.kotlin - keyword.operator.kotlin

  val test2 =!isC
//          ^ keyword.operator.assignment.kotlin
//           ^^^ - keyword.operator.kotlin

if (test3!is String) return
//       ^^^ source.kotlin meta.group.kotlin keyword.operator.kotlin
