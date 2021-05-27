package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import A
import B


fun main() { 
SmartReflekt.classes<A>().filter { true }.resolve()
SmartReflekt.classes<B>().filter { true }.resolve()
SmartReflekt.functions<Function1<A, A>>().filter { true }.resolve()
}