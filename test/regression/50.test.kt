// SYNTAX TEST "source.kotlin" "Soft keywords should not be parsed as modifiers"

fun foo(expect: String) {}
//      ^^^^^^ - storage.modifier.kotlin

val expect = "42"
//  ^^^^^^ - storage.modifier.kotlin

foo(expect = expect)
//  ^^^^^^ - storage.modifier.kotlin
//           ^^^^^^ - storage.modifier.kotlin

expect class Klass(val expect : Int)
//                     ^^^^^^ - storage.modifier.kotlin

expect     class A
// <------ storage.modifier.kotlin

Klass(expect = 42)
//    ^^^^^^ - storage.modifier.kotlin

expect
// <------ - storage.modifier.kotlin

expect    + anotherVar
// <------ - storage.modifier.kotlin

    expect    
//  ^^^^^^ - storage.modifier.kotlin

stes += expect
//      ^^^^^^ - storage.modifier.kotlin

expect += 1
// <------  - storage.modifier.kotlin

fun formatString(source: String, vararg args: Any): String
//                               ^^^^^^ storage.modifier.kotlin

val vararg : String = ""
//  ^^^^^^ - storage.modifier.kotlin