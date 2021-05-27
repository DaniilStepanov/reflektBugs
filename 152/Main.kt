package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt

fun main() { 
SmartReflekt.functions<Function1<Char, String>>().filter { true }.resolve()
SmartReflekt.functions<Function2<Int, StringBuilder, String>>().filter { true }.resolve()
}