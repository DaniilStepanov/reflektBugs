package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import test.My


fun main() { 
SmartReflekt.classes<test.My>().filter { true }.resolve()
}