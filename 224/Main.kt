package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import X


fun main() { 
SmartReflekt.classes<X>().filter { true }.resolve()
SmartReflekt.functions<Function1<String, String>>().filter { true }.resolve()
}