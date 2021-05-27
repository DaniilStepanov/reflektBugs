@file:JvmMultifileClass
@file:JvmName("A")

import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

@Suppress("UNSUPPORTED_FEATURE")
inline class I(val x: Any?)

suspend fun <T> suspendHere(): T = suspendCoroutineUninterceptedOrReturn {
    c = it as Continuation<Any?>
    COROUTINE_SUSPENDED
}

var c: Continuation<Any?>? = null

suspend fun f(): I = I(suspendHere<String>())