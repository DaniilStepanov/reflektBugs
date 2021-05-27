//WITH_RUNTIME
//WITH_RUNTIME
import kotlin.test.assertEquals

enum class TestEnumClass(val x: Int) {
    ZERO
    ;
    constructor(): this(0)
}

fun box(): String {
    assertEquals(TestEnumClass.ZERO.x, 0)

    return "OK"
}