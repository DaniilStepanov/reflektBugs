import helpers.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

suspend fun suspendHere(): String = suspendCoroutineUninterceptedOrReturn { x ->
    x.resume("OK")
    COROUTINE_SUSPENDED
}

fun builder(c: suspend () -> Unit) {
    var wasResumeCalled = false
    c.startCoroutine(object : ContinuationAdapter<Unit>() {
        override val context = EmptyCoroutineContext

        override fun resume(value: Unit) {
            wasResumeCalled = true
        }

        override fun resumeWithException(exception: Throwable) {

        }
    })

    if (!wasResumeCalled) throw RuntimeException("fail 1")
}

fun box(): String {
    var result = ""

    builder {
        if (result == "") return@builder
        suspendHere()
        throw RuntimeException("fail 2")
    }

    result = "fail"

    builder {
        if (result == "") return@builder
        result = suspendHere()
    }

    return result
}