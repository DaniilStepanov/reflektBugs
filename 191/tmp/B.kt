import aaa.E.*

fun box(): String {
    if (TRIVIAL_ENTRY == SUBCLASS) return "Fail 1"
    if (Nested().fortyTwo() != 42) return "Fail 2"
    return "OK"
}