package stuff
import helpers.*

import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

object Host {
    suspend fun suspendHere(): String = suspendCoroutineUninterceptedOrReturn { x ->
        x.resume("OK")
        COROUTINE_SUSPENDED
    }
}