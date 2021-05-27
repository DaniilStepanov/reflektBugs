package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import E
import I


fun main() { 
SmartReflekt.classes<E>().filter { true }.resolve()
SmartReflekt.classes<I>().filter { true }.resolve()
SmartReflekt.functions<Function1<E, String>>().filter { true }.resolve()
SmartReflekt.functions<Function1<E, E>>().filter { true }.resolve()
}