fun box(): String {
    var result = 0u
    val uIntRange = 1u..3u
    for (i: UInt? in uIntRange) {
        result = sum(result, i)
    }
    return if (result == 6u) "OK" else "fail: $result"
}

fun sum(i: UInt, z: UInt?): UInt {
    return i + z!!
}