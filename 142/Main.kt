package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import test.Season


fun main() { 
SmartReflekt.classes<test.Season>().filter { true }.resolve()
SmartReflekt.functions<Function0<Season>>().filter { true }.resolve()
}