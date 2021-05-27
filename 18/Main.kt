package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import I


fun main() { 
SmartReflekt.classes<I>().filter { true }.resolve()
SmartReflekt.functions<Function0<Unit>>().filter { true }.resolve()
}