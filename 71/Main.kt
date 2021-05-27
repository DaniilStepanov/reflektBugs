package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import A
import Z


fun main() { 
SmartReflekt.classes<A>().filter { true }.resolve()
SmartReflekt.classes<Z>().filter { true }.resolve()
}