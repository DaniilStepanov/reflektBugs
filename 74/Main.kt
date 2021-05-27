package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt

fun main() { 
SmartReflekt.functions<Function4<UByte, UShort, UInt, ULong, ULong>>().filter { true }.resolve()
}