import helpers.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

suspend fun catchException(): String {
    try {
        return suspendWithException()
    }
    catch(e: Exception) {
        return e.message!!
    }
}

suspend fun suspendWithException(): String = "OK".also { TailCallOptimizationChecker.saveStackTrace() }

fun builder(c: suspend () -> Unit) {
    c.startCoroutine(EmptyContinuation)
}

fun box(): String {
    var res = "FAIL"
    builder {
        res = catchException()
    }
    TailCallOptimizationChecker.checkStateMachineIn("catchException")
    return res
}