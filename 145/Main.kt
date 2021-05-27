package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Test


fun main() { 
SmartReflekt.classes<Test>().filter { true }.resolve()
SmartReflekt.functions<Function1<Test, Test>>().filter { true }.resolve()
}