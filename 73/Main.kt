package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Letters


fun main() { 
SmartReflekt.classes<Letters>().filter { true }.resolve()
}