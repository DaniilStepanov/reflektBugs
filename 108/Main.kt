package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Game


fun main() { 
SmartReflekt.classes<Game>().filter { true }.resolve()
}