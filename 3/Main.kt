package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Outer


fun main() { 
SmartReflekt.classes<Outer>().filter { true }.resolve()
SmartReflekt.classes<Outer.Nested>().filter { true }.resolve()
}