package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt

fun main() { 
SmartReflekt.functions<Function1<UIntArray, UIntArray>>().filter { true }.resolve()
SmartReflekt.functions<Function1<UIntArray, UInt>>().filter { true }.resolve()
}