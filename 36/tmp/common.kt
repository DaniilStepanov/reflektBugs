enum class Base {
    A, B
}

fun testCommon(base: Base) {
    val x = when (base) { // must be Ok
        Base.A -> 1
        Base.B -> 2
    }
}