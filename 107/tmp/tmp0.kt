import helpers.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

inline suspend fun suspendThere(v: String): String = suspendCoroutineUninterceptedOrReturn { x ->
    TailCallOptimizationChecker.saveStackTrace(x)
    x.resume(v)
    COROUTINE_SUSPENDED
}

inline suspend fun suspendHere(): String = suspendThere("O") + suspendThere("K")
suspend fun mainSuspend() = suspendHere()

fun builder(c: suspend () -> Unit) {
    c.startCoroutine(EmptyContinuation)
}

fun box(): String {
    var result = ""

    builder {
        result = mainSuspend()
    }

    TailCallOptimizationChecker.checkStateMachineIn("mainSuspend")

    return result
}