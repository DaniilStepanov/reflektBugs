package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import A1
import A2


fun main() { 
SmartReflekt.classes<A1>().filter { true }.resolve()
SmartReflekt.classes<A2>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}