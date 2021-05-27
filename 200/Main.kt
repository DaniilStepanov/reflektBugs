package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import ClassTemplate


fun main() { 
SmartReflekt.classes<ClassTemplate>().filter { true }.resolve()
}