package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import aaa.E


fun main() { 
SmartReflekt.classes<aaa.E>().filter { true }.resolve()
}