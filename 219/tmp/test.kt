import helpers.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*
import stuff.Host.suspendHere

fun builder(c: suspend () -> Unit) {
    c.startCoroutine(EmptyContinuation)
}

fun box(): String {
    var result = ""

    builder {
        result = suspendHere()
    }

    return result
}