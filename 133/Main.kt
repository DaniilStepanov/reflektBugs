package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Context


fun main() { 
SmartReflekt.classes<Context>().filter { true }.resolve()
SmartReflekt.classes<Context.Companion.OsType>().filter { true }.resolve()
}