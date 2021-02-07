// SYNTAX TEST "source.kotlin" "Generic"
class Test<in T : CharSequence> {
//        ^ punctuation.bracket.angle.begin.kotlin
//         ^^ storage.modifier.generic.variance.kotlin
//            ^ meta.class.kotlin entity.name.type.class.kotlin
//                ^^^^^^^^^^^^ meta.class.kotlin support.class.kotlin
//                            ^ punctuation.bracket.angle.end.kotlin
    fun <E : Number> do(input: T) {
//      ^ punctuation.bracket.angle.begin.kotlin
//       ^ meta.class.kotlin entity.name.type.class.kotlin
//           ^^^^^^ meta.class.kotlin entity.name.type.class.kotlin
//                 ^ punctuation.bracket.angle.end.kotlin
    }
}

val list: MutableList<*>
//                   ^ punctuation.bracket.angle.begin.kotlin
//                    ^ storage.modifier.generic.wildcard.kotlin
//                     ^ punctuation.bracket.angle.end.kotlin
