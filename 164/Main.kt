package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import I
import C


fun main() { 
SmartReflekt.classes<I>().filter { true }.resolve()
SmartReflekt.classes<C>().filter { true }.resolve()
SmartReflekt.functions<Function0<Nothing>>().filter { true }.resolve()
SmartReflekt.functions<Function1<Int, Nothing>>().filter { true }.resolve()
}