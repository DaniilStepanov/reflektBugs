import helpers.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*


var resume: () -> Unit = {}

suspend fun suspendHere(): String = suspendCoroutineUninterceptedOrReturn { cont ->
    resume = {
        cont.resumeWithException(RuntimeException("Do not catch me"))
    }
    COROUTINE_SUSPENDED
}

fun builder(c: suspend () -> Unit) {
    c.startCoroutine(EmptyContinuation)
}

fun box(): String {
    var result = ""

    var count = 0
    try {
        builder {
            try {
                suspendHere()
                count = 1
            } finally {
                if (count == 0) {
                    count = 2
                    result = "O"
                    throw Exception("K")
                } else if (count == 2) {
                    result = "FAIL: execution gets into infinite loop"
                } else {
                    result = "FAIL: exception has not been thrown"
                }
            }
        }
        resume()
    } catch (x: Exception) {
        result += x.message
    }


    return result
}