import helpers.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

var continuation: () -> Unit = { }
var log = ""
var finished = false

suspend fun <T> foo(v: T): T = suspendCoroutineUninterceptedOrReturn { x ->
    continuation = {
        x.resume(v)
    }
    log += "foo($v);"
    COROUTINE_SUSPENDED
}

inline suspend fun boo(v: String): String {
    foo("!$v")
    log += "boo($v);"
    return foo(v)
}

inline suspend fun bar(v: String): String {
    val x = boo(v)
    log += "bar($x);"
    return x
}

fun builder(c: suspend () -> Unit) {
    c.startCoroutine(handleResultContinuation {
        continuation = { }
        finished = true
    })
}