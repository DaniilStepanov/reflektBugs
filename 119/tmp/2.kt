import kotlin.coroutines.*
import test.*

fun builder(c: suspend () -> Unit) {
    c.startCoroutine(Continuation(EmptyCoroutineContext) {
        it.getOrThrow()
    })
}

fun box(): String {
    var res = ordinary("O", IC("K"))
    if (res != "OK") return "FAIL 1: $res"
    builder {
        res = suspend("O", IC("K"))
    }
    return res
}