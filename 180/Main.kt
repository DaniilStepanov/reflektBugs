package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt

fun main() { 
SmartReflekt.classes<example2.Context.OsType>().filter { true }.resolve()
}