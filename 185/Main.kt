package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import test.TestEnum


fun main() { 
SmartReflekt.classes<test.TestEnum>().filter { true }.resolve()
}