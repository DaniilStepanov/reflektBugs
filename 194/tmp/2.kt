class D : I {
    fun box(): String = foo()
}

fun box(): String = D().box()