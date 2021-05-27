package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import library.EnumClass


fun main() { 
SmartReflekt.classes<library.EnumClass>().filter { true }.resolve()
SmartReflekt.functions<Function0<EnumClass>>().filter { true }.resolve()
}