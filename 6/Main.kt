package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import En


fun main() { 
SmartReflekt.classes<En>().filter { true }.resolve()
}