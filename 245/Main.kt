package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import C


fun main() { 
SmartReflekt.classes<C>().filter { true }.resolve()
SmartReflekt.functions<Function1<Long, String>>().filter { true }.resolve()
}