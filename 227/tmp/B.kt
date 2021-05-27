import aaa.E

fun box(): String {
    if (E.TRIVIAL_ENTRY == E.SUBCLASS) return "Fail"
    return "OK"
}