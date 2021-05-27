package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import O


fun main() { 
SmartReflekt.classes<O>().filter { true }.resolve()
SmartReflekt.functions<Function0<Unit>>().filter { true }.resolve()
}