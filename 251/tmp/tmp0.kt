import helpers.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

suspend fun suspendThere(v: String): String = suspendCoroutineUninterceptedOrReturn { x ->
    x.resume(v)
    COROUTINE_SUSPENDED
}

suspend fun suspendHere(): String = suspendThere("O") + suspendThere("K")

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