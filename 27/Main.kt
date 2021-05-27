package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import E
import F


fun main() { 
SmartReflekt.classes<E>().filter { true }.resolve()
SmartReflekt.classes<F>().filter { true }.resolve()
}