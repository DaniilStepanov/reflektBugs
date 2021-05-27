package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import test.State


fun main() { 
SmartReflekt.classes<test.State>().filter { true }.resolve()
}