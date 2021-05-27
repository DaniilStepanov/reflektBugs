package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Bar


fun main() { 
SmartReflekt.classes<Bar>().filter { true }.resolve()
SmartReflekt.functions<Function1<Bar, Bar>>().filter { true }.resolve()
}