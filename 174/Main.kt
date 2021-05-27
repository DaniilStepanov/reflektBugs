package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import aaa.A


fun main() { 
SmartReflekt.classes<aaa.A>().filter { true }.resolve()
SmartReflekt.classes<aaa.A.E>().filter { true }.resolve()
}