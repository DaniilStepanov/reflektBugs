package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import IOk
import InlineClass


fun main() { 
SmartReflekt.classes<IOk>().filter { true }.resolve()
SmartReflekt.classes<InlineClass>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}