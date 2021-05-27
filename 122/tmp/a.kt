@file:JvmMultifileClass
@file:JvmName("A")

import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

@Suppress("UNSUPPORTED_FEATURE")
inline class I(val x: Any?)

suspend fun <T> suspendHere(t: T): T = t

suspend fun f(): I = I(suspendHere("OK"))