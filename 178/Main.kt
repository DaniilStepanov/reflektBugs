package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Named
import E


fun main() { 
SmartReflekt.classes<Named>().filter { true }.resolve()
SmartReflekt.classes<E>().filter { true }.resolve()
}