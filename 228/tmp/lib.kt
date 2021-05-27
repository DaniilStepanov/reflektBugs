suspend inline fun foo(v: String): String = v

suspend inline fun bar(): String = foo("O")