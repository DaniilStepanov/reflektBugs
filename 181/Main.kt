package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Controller


fun main() { 
SmartReflekt.classes<Controller>().filter { true }.resolve()
SmartReflekt.functions<Function2<String, String, String>>().filter { true }.resolve()
}