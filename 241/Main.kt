package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Ordinaled
import A


fun main() { 
SmartReflekt.classes<Ordinaled>().filter { true }.resolve()
SmartReflekt.classes<A>().filter { true }.resolve()
}