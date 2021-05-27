package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import BooleanWrap


fun main() { 
SmartReflekt.classes<BooleanWrap>().filter { true }.resolve()
}