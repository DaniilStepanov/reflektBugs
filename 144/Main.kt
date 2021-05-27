package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Level


fun main() { 
SmartReflekt.classes<Level>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}