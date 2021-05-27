package test

inline class IC(val s: String)

fun ordinary(s: String, ic: IC): String = s + ic.s

suspend fun suspend(s: String, ic: IC): String = s + ic.s