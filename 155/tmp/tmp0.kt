import helpers.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*
import kotlin.reflect.KProperty

suspend fun suspendThere(v: String): String = suspendCoroutineUninterceptedOrReturn { x ->
    x.resume(v)
    COROUTINE_SUSPENDED
}

class A(val x: String) {
    var isSetValueCalled = false
    var isProvideDelegateCalled = false
    var isMinusAssignCalled = false
    var isIncCalled = false
    operator suspend fun component1() = suspendThere(x + "K")
    // There is no reason to support these operators until suspend properties are supported
//

    operator suspend fun plus(y: String) = suspendThere(x + y)
    operator suspend fun unaryPlus() = suspendThere(x + "K")

    operator suspend fun inc(): A = suspendCoroutineUninterceptedOrReturn { x ->
        isIncCalled = true
        x.resume(this)
        COROUTINE_SUSPENDED
    }

    operator suspend fun minusAssign(y: String): Unit = suspendCoroutineUninterceptedOrReturn { x ->
        if (y != "56") return@suspendCoroutineUninterceptedOrReturn Unit
        isMinusAssignCalled = true
        x.resume(Unit)
        COROUTINE_SUSPENDED
    }

    operator suspend fun compareTo(y: String): Int = suspendCoroutineUninterceptedOrReturn { x ->
        x.resume("56".compareTo(y))
        COROUTINE_SUSPENDED
    }
}

fun builder(c: suspend () -> Unit) {
    c.startCoroutine(EmptyContinuation)
}

var a = A("O")

//suspend fun foo1() {
//
//
//
//}

suspend fun foo2() {
    val (y) = a
    if (y != "OK") throw RuntimeException("fail 3")
}

suspend fun foo3() {
    val y = a + "K"
    if (y != "OK") throw RuntimeException("fail 4")
}

suspend fun foo4() {
    val y = + a
    if (y != "OK") throw RuntimeException("fail 5")
}

suspend fun foo5() {
    a -= "56"
    if (!a.isMinusAssignCalled) throw RuntimeException("fail 6")
}

suspend fun foo6() {
    var y = a++
    if (!y.isIncCalled) throw RuntimeException("fail 7")
}

suspend fun foo7() {
    a.isIncCalled = false
    val y = ++a
    if (!y.isIncCalled) throw RuntimeException("fail 8")
}

//suspend fun foo8() {
//
//}

suspend fun checkCompareTo(v: String) = (a < v) == ("56" < v)

suspend fun foo9() {
    if (!checkCompareTo("55")) throw RuntimeException("fail 12")
    if (!checkCompareTo("56")) throw RuntimeException("fail 13")
    if (!checkCompareTo("57")) throw RuntimeException("fail 14")
}

fun box(): String {

    builder {
        //foo1()
        foo2()
        foo3()
        foo4()
        foo5()
        foo6()
        foo7()
        //foo8()
        foo9()
    }

    return "OK"
}