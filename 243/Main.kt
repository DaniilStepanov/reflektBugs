package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import I
import A
import B


fun main() { 
SmartReflekt.classes<I>().filter { true }.resolve()
SmartReflekt.classes<A>().filter { true }.resolve()
SmartReflekt.classes<B>().filter { true }.resolve()
SmartReflekt.functions<Function1<String, String>>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}