package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import A


fun main() { 
SmartReflekt.classes<A>().filter { true }.resolve()
SmartReflekt.functions<Function2<String, String, String>>().filter { true }.resolve()
}