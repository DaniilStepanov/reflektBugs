inline class Location @JvmOverloads constructor(val value: String? = "OK")

fun box(): String = Location().value!!