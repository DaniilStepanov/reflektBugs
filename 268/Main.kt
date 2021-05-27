package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import FooEnum


fun main() { 
SmartReflekt.classes<FooEnum>().filter { true }.resolve()
}