package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Z
import A


fun main() { 
SmartReflekt.classes<Z>().filter { true }.resolve()
SmartReflekt.classes<A>().filter { true }.resolve()
SmartReflekt.functions<Function1<A, Z>>().filter { true }.resolve()
}