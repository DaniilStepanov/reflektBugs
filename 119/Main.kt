package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import test.IC


fun main() { 
SmartReflekt.classes<test.IC>().filter { true }.resolve()
SmartReflekt.functions<Function2<String, IC, String>>().filter { true }.resolve()
}