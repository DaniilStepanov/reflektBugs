package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Foo6
import Foo7


fun main() { 
SmartReflekt.classes<Foo6>().filter { true }.resolve()
SmartReflekt.functions<Function0<Nothing>>().filter { true }.resolve()
SmartReflekt.functions<Function1<Boolean, Any>>().filter { true }.resolve()
SmartReflekt.functions<Function0<Any>>().filter { true }.resolve()
}