package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Callback
import Foo


fun main() { 
SmartReflekt.classes<Callback>().filter { true }.resolve()
SmartReflekt.classes<Foo>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
SmartReflekt.functions<Function0<Foo>>().filter { true }.resolve()
}