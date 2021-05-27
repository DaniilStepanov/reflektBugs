package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import SnekDirection


fun main() { 
SmartReflekt.classes<SnekDirection>().filter { true }.resolve()
SmartReflekt.functions<Function0<SnekDirection>>().filter { true }.resolve()
}