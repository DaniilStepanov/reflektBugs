package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import A
import B
import Z


fun main() { 
SmartReflekt.classes<B>().filter { true }.resolve()
SmartReflekt.classes<Z>().filter { true }.resolve()
}