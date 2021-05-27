package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Bar


fun main() { 
SmartReflekt.classes<Bar>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}