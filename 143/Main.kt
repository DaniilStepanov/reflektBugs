package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import A
import B
import OK


fun main() { 
SmartReflekt.classes<A>().filter { true }.resolve()
SmartReflekt.classes<B>().filter { true }.resolve()
SmartReflekt.classes<OK>().filter { true }.resolve()
SmartReflekt.functions<Function1<String, String>>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}