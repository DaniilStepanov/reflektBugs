package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import State


fun main() { 
SmartReflekt.classes<State>().filter { true }.resolve()
}