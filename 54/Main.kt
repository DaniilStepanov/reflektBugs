package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import X
import Z


fun main() { 
SmartReflekt.classes<X>().filter { true }.resolve()
SmartReflekt.classes<Z>().filter { true }.resolve()
}