enum class Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
}

fun foo() = Season.SPRING

fun box() =
    if (foo() == Season.SPRING) "OK"
    else "fail"