package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Controller


fun main() { 
SmartReflekt.classes<Controller>().filter { true }.resolve()
SmartReflekt.functions<Function0<Unit>>().filter { true }.resolve()
SmartReflekt.functions<Function1<String, String>>().filter { true }.resolve()
SmartReflekt.functions<Function1<Exception, String>>().filter { true }.resolve()
}