package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Location


fun main() { 
SmartReflekt.classes<Location>().filter { true }.resolve()
}