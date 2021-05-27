package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Test


fun main() { 
SmartReflekt.classes<Test>().filter { true }.resolve()
SmartReflekt.functions<Function0<Test>>().filter { true }.resolve()
}