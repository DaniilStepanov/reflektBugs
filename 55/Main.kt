package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Color
import Direction


fun main() { 
SmartReflekt.classes<Color>().filter { true }.resolve()
SmartReflekt.classes<Direction>().filter { true }.resolve()
SmartReflekt.functions<Function1<Color, Color>>().filter { true }.resolve()
SmartReflekt.functions<Function1<Direction, Direction>>().filter { true }.resolve()
}