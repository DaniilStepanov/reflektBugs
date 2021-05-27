package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import TestEnumClass


fun main() { 
SmartReflekt.classes<TestEnumClass>().filter { true }.resolve()
}