inline class S(val string: String)

enum class Test(val s: S) {
    OK(S("OK"))
}

fun box() = Test.OK.s.string