package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt

fun main() { 
SmartReflekt.functions<Function4<Double, String, Long, String, String>>().filter { true }.resolve()
}