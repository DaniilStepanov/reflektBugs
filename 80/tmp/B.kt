import library.EnumClass

fun box(): String {
    return if (EnumClass.entry() != EnumClass.ENTRY) "Fail" else "OK"
}