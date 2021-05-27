package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Sign


fun main() { 
SmartReflekt.classes<Sign>().filter { true }.resolve()
}