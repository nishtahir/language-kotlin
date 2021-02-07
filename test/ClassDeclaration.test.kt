// SYNTAX TEST "source.kotlin" "Class Declaration"
class Test() {
// <--- meta.class.kotlin storage.modifier.kotlin
//    ^^^^ source.kotlin meta.class.kotlin entity.name.class.kotlin
//        ^ meta.class.kotlin meta.parameters.kotlin punctuation.section.group.begin.kotlin punctuation.definition.parameters.begin.kotlin
//         ^ meta.class.kotlin meta.parameters.kotlin punctuation.section.group.end.kotlin punctuation.definition.parameters.end.kotlin
//           ^ meta.block.kotlin punctuation.section.group.begin.kotlin
}
// <--- source.kotlin meta.class.kotlin meta.block.kotlin punctuation.section.group.end.kotlin

expect class Foo(bar: String)
// <-- storage.modifier.kotlin
//     ^^^^^ meta.class.kotlin storage.modifier.kotlin
//           ^^^ source.kotlin meta.class.kotlin entity.name.class.kotlin
//              ^ meta.class.kotlin meta.parameters.kotlin punctuation.section.group.begin.kotlin punctuation.definition.parameters.begin.kotlin
//               ^^^ variable.parameter.function.kotlin
//                    ^^^^^^ support.class.kotlin
//                          ^ punctuation.section.group.end.kotlin punctuation.definition.parameters.end.kotlin

expect class Foo(bar: String, baz: String)
//                          ^ punctuation.seperator.kotlin
//                            ^^^ variable.parameter.function.kotlin
//                                 ^^^^^^ support.class.kotlin

actual class Foo(bar: String) {
//                            ^ punctuation.section.group.begin.kotlin
    actual fun frob() {
//  ^^^^^^ storage.modifier.kotlin
//         ^^^ keyword.other.kotlin
//             ^^^^ entity.name.function.kotlin
//                 ^ meta.function.kotlin meta.parameters.kotlin punctuation.section.group.begin.kotlin punctuation.definition.parameters.begin.kotlin
//                  ^ meta.function.kotlin meta.parameters.kotlin punctuation.section.group.end.kotlin punctuation.definition.parameters.end.kotlin
//                    ^ meta.block.kotlin punctuation.section.group.begin.kotlin
    }
//  ^ meta.block.kotlin punctuation.section.group.end.kotlin  
}
// <--- ^ punctuation.section.group.begin.kotlin

enum class A {
//         ^ source.kotlin meta.class.kotlin entity.name.class.kotlin
    B
//  ^ source.kotlin meta.class.kotlin meta.block.kotlin entity.name.type.class.kotlin
}
