package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import A


fun main() { 
SmartReflekt.functions<Function1<Any, String>>().filter { true }.resolve()
}