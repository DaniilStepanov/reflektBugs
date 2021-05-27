import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

suspend fun baz() {
    val a = bar("A")
    log += "$a;"
    log += "between bar;"
    val b = bar("B")
    log += "$b;"
}

val expectedString =
        "foo(!A);@;boo(A);foo(A);@;bar(A);A;" +
        "between bar;" +
        "foo(!B);@;boo(B);foo(B);@;bar(B);B;"

fun box(): String {
    builder {
        baz()
    }

    while (!finished) {
        log += "@;"
        continuation()
    }

    if (log != expectedString) return "fail: $log"

    return "OK"
}