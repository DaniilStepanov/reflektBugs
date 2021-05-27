package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import MyEnum


fun main() { 
SmartReflekt.classes<MyEnum>().filter { true }.resolve()
}