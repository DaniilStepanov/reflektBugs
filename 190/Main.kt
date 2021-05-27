package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import A
import E


fun main() { 
SmartReflekt.classes<A>().filter { true }.resolve()
SmartReflekt.classes<E>().filter { true }.resolve()
}