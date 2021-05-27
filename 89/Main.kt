package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import First
import Second
import E


fun main() { 
SmartReflekt.classes<First>().filter { true }.resolve()
SmartReflekt.classes<Second>().filter { true }.resolve()
SmartReflekt.classes<E>().filter { true }.resolve()
}