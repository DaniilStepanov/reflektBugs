package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import S
import IFoo
import Test


fun main() { 
SmartReflekt.classes<S>().filter { true }.resolve()
SmartReflekt.classes<Test>().filter { true }.resolve()
SmartReflekt.functions<Function2<S, String, String>>().filter { true }.resolve()
SmartReflekt.functions<Function1<String, String>>().filter { true }.resolve()
}