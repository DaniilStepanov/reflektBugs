package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Season


fun main() { 
SmartReflekt.classes<Season>().filter { true }.resolve()
SmartReflekt.functions<Function1<Any, String>>().filter { true }.resolve()
}