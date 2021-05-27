package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import A


fun main() { 
SmartReflekt.classes<A>().filter { true }.resolve()
SmartReflekt.functions<Function1<A, String>>().filter { true }.resolve()
SmartReflekt.functions<Function1<String, Unit>>().filter { true }.resolve()
}