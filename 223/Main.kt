package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt

fun main() { 
SmartReflekt.functions<Function5<Byte, String, Int, Double, Long, String>>().filter { true }.resolve()
}