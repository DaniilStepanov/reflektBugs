package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import X
import Y


fun main() { 
SmartReflekt.classes<X>().filter { true }.resolve()
SmartReflekt.classes<Y>().filter { true }.resolve()
SmartReflekt.functions<Function2<String, Int, String>>().filter { true }.resolve()
SmartReflekt.functions<Function3<String, String, String, String>>().filter { true }.resolve()
}