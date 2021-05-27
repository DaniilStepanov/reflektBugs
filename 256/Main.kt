package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import E
import A
import Anno
import TTT


fun main() { 
SmartReflekt.classes<E>().filter { true }.resolve()
SmartReflekt.classes<A>().filter { true }.resolve()
SmartReflekt.classes<Anno>().filter { true }.resolve()
SmartReflekt.classes<TTT>().filter { true }.resolve()
}