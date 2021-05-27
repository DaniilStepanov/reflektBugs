package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Base


fun main() { 
SmartReflekt.classes<Base>().filter { true }.resolve()
}