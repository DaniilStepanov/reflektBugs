fun testPlatform(base: Base) {
    val x = when (base) { // must be OK
        Base.A -> 1
        Base.B -> 2
    }
}

fun box() = "OK"