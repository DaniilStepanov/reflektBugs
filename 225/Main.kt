package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt

fun main() { 
SmartReflekt.functions<Function1<String, String>>().filter { true }.resolve()
SmartReflekt.functions<Function1<Boolean, String>>().filter { true }.resolve()
}