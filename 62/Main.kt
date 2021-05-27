package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt

fun main() { 
SmartReflekt.functions<Function0<Nothing>>().filter { true }.resolve()
}