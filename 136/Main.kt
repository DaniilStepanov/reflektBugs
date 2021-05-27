package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt

fun main() { 
SmartReflekt.functions<Function4<Int, Long, Byte, String, String>>().filter { true }.resolve()
SmartReflekt.functions<Function4<Int, Long, String, Byte, String>>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}