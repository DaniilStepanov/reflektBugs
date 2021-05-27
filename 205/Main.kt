package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import UInt
import ULong


fun main() { 
SmartReflekt.classes<UInt>().filter { true }.resolve()
SmartReflekt.classes<ULong>().filter { true }.resolve()
SmartReflekt.functions<Function1<UInt, ULong>>().filter { true }.resolve()
}