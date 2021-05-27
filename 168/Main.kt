package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import IC
import IBar
import Test1
import Test2


fun main() { 
SmartReflekt.classes<IC>().filter { true }.resolve()
SmartReflekt.classes<IBar>().filter { true }.resolve()
SmartReflekt.classes<Test1>().filter { true }.resolve()
SmartReflekt.classes<Test2>().filter { true }.resolve()
SmartReflekt.functions<Function0<IC>>().filter { true }.resolve()
SmartReflekt.functions<Function0<Any>>().filter { true }.resolve()
}