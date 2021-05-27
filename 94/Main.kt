package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import E


fun main() { 
SmartReflekt.classes<E>().filter { true }.resolve()
SmartReflekt.classes<E.Nested>().filter { true }.resolve()
}