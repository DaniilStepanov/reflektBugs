package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import test.E


fun main() { 
SmartReflekt.classes<test.E>().filter { true }.resolve()
}