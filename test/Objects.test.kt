// SYNTAX TEST "source.kotlin" "Object"

  addListener(object : AnimatorListenerAdapter() {
//           ^ meta.group.kotlin punctuation.section.group.begin.kotlin
//            ^^^^^^ meta.group.kotlin storage.type.kotlin
//                  ^ meta.group.kotlin
//                   ^ meta.group.kotlin keyword.operator.declaration.kotlin
//                    ^ meta.group.kotlin
//                     ^^^^^^^^^^^^^^^^^^^^^^^ meta.group.kotlin entity.name.type.class.kotlin
//                                            ^ meta.group.kotlin meta.group.kotlin punctuation.section.group.begin.kotlin
//                                             ^ meta.group.kotlin meta.group.kotlin punctuation.section.group.end.kotlin
//                                              ^ meta.group.kotlin
//                                               ^ meta.group.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
      override fun onAnimationEnd(animation: Animator) {
//^^^^ meta.group.kotlin meta.block.kotlin
//    ^^^^^^^^ meta.group.kotlin meta.block.kotlin storage.modifier.kotlin
//            ^ meta.group.kotlin meta.block.kotlin
//             ^^^ meta.group.kotlin meta.block.kotlin meta.function.kotlin keyword.other.kotlin
//                ^ meta.group.kotlin meta.block.kotlin meta.function.kotlin
//                 ^^^^^^^^^^^^^^ meta.group.kotlin meta.block.kotlin meta.function.kotlin entity.name.function.kotlin
//                               ^ meta.group.kotlin meta.block.kotlin meta.function.kotlin meta.parameters.kotlin punctuation.section.group.begin.kotlin punctuation.definition.parameters.begin.kotlin
//                                ^^^^^^^^^ meta.group.kotlin meta.block.kotlin meta.function.kotlin meta.parameters.kotlin variable.parameter.function.kotlin
//                                         ^ meta.group.kotlin meta.block.kotlin meta.function.kotlin meta.parameters.kotlin keyword.operator.declaration.kotlin
//                                          ^ meta.group.kotlin meta.block.kotlin meta.function.kotlin meta.parameters.kotlin
//                                           ^^^^^^^^ meta.group.kotlin meta.block.kotlin meta.function.kotlin meta.parameters.kotlin entity.name.type.class.kotlin
//                                                   ^ meta.group.kotlin meta.block.kotlin meta.function.kotlin meta.parameters.kotlin punctuation.section.group.end.kotlin punctuation.definition.parameters.end.kotlin
//                                                    ^ meta.group.kotlin meta.block.kotlin meta.function.kotlin
//                                                     ^ meta.group.kotlin meta.block.kotlin meta.function.kotlin meta.block.kotlin punctuation.section.group.begin.kotlin
          
      }
//^^^^ meta.group.kotlin meta.block.kotlin meta.function.kotlin meta.block.kotlin
//    ^ meta.group.kotlin meta.block.kotlin meta.function.kotlin meta.block.kotlin punctuation.section.group.end.kotlin
  })
//^ meta.group.kotlin meta.block.kotlin punctuation.section.group.end.kotlin
// ^ meta.group.kotlin punctuation.section.group.end.kotlin
