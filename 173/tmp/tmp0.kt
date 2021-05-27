import helpers.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*


suspend fun foo(str: String) = str

suspend fun test(): String {
    return foo("""${foo("O")}${foo("K")}""")
}

fun builder(c: suspend () -> Unit) {
    c.startCoroutine(EmptyContinuation)
}

fun box(): String {
    var result = "FAIL"

    builder {
        result = test()
    }

    return result
}