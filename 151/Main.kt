package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import test.KEnum


fun main() { 
SmartReflekt.classes<test.KEnum>().filter { true }.resolve()
SmartReflekt.functions<Function1<KEnum, String>>().filter { true }.resolve()
}