package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import S
import Test


fun main() { 
SmartReflekt.classes<S>().filter { true }.resolve()
SmartReflekt.classes<Test>().filter { true }.resolve()
}