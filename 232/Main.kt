package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Bar
import Foo


fun main() { 
SmartReflekt.classes<Bar>().filter { true }.resolve()
SmartReflekt.classes<Foo>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}