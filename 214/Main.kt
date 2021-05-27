package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Color


fun main() { 
SmartReflekt.classes<Color>().filter { true }.resolve()
}