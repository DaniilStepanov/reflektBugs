package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Writer


fun main() { 
SmartReflekt.classes<Writer>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}