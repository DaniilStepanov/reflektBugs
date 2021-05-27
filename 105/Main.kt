package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Inner
import A


fun main() { 
SmartReflekt.classes<Inner>().filter { true }.resolve()
SmartReflekt.classes<A>().filter { true }.resolve()
SmartReflekt.functions<Function0<A>>().filter { true }.resolve()
SmartReflekt.functions<Function1<Int, A>>().filter { true }.resolve()
SmartReflekt.functions<Function0<Any>>().filter { true }.resolve()
SmartReflekt.functions<Function1<Int, Any>>().filter { true }.resolve()
}