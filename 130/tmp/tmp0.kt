import kotlin.coroutines.*

interface IOk {
    fun ok(): String = "OK"
}

inline class InlineClass(val s: String) : IOk

suspend fun returnsUnboxed() = InlineClass("")

suspend fun test(): String = returnsUnboxed().ok()

fun builder(c: suspend () -> Unit) {
    c.startCoroutine(Continuation(EmptyCoroutineContext) {
        it.getOrThrow()
    })
}

fun box(): String {
    var res = "FAIL"
    builder {
        res = test()
    }
    return res
}