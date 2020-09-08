// SYNTAX TEST "source.kotlin" " < and > in generics are incorrectly scoped as comparison operators #19 "

// TODO fill out appropriate scope for generics params

  fun main(@NonNull args: Array<String>) {
//                             ^ -keyword.operator.comparison.kotlin
//                                    ^ -keyword.operator.comparison.kotlin
  }