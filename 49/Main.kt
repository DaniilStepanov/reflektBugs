package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Variants


fun main() { 
SmartReflekt.classes<Variants>().filter { true }.resolve()
}