// SYNTAX TEST "source.kotlin" "Keywords"

suspend fun suspendFunction() {
// <------- source.kotlin storage.modifier.kotlin
//      ^^^ source.kotlin  meta.function.kotlin
//          ^^^^^^^^^^^^^^^ source.kotlin meta.function.kotlin entity.name.function.kotlin - storage.modifier.kotlin
}

explicitSuspendCall(suspend { delay(10) })
//                  ^^^^^^^ - storage.modifier.kotlin