package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt

fun main() { 
SmartReflekt.functions<Function2<UInt, UInt, UInt>>().filter { true }.resolve()
}