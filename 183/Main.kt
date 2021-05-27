package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import UInt


fun main() { 
SmartReflekt.classes<UInt>().filter { true }.resolve()
SmartReflekt.functions<Function0<UInt>>().filter { true }.resolve()
SmartReflekt.functions<Function1<UInt, UInt>>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}