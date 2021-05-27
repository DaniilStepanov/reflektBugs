package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt

fun main() { 
SmartReflekt.functions<Function2<Double, Long, String>>().filter { true }.resolve()
}