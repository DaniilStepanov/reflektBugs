package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import C


fun main() { 
SmartReflekt.classes<C>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
SmartReflekt.functions<Function6<Int, Double, Float, Long, String, C, String>>().filter { true }.resolve()
}