package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Q
import PropEnum


fun main() { 
SmartReflekt.classes<Q>().filter { true }.resolve()
SmartReflekt.classes<PropEnum>().filter { true }.resolve()
}