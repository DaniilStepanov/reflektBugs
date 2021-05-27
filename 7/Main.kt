package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt

fun main() { 
SmartReflekt.functions<Function1<Int, Unit>>().filter { true }.resolve()
}