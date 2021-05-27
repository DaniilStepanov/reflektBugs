package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Enum
import Outer


fun main() { 
SmartReflekt.classes<Enum>().filter { true }.resolve()
SmartReflekt.classes<Outer>().filter { true }.resolve()
SmartReflekt.functions<Function0<Enum>>().filter { true }.resolve()
}