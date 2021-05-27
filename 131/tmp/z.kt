import helpers.*
import kotlin.coroutines.*

fun box(): String {
    var result = "fail"
    suspend { result = f().x as String }.startCoroutine(EmptyContinuation)
    c?.resume("OK")
    return result
}