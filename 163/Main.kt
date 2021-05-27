package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import E
import C


fun main() { 
SmartReflekt.classes<E>().filter { true }.resolve()
SmartReflekt.classes<C>().filter { true }.resolve()
}