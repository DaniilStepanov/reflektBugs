package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Rgba
import RgbaArray


fun main() { 
SmartReflekt.classes<Rgba>().filter { true }.resolve()
SmartReflekt.classes<RgbaArray>().filter { true }.resolve()
SmartReflekt.functions<Function4<Int, Int, Int, Int, Rgba>>().filter { true }.resolve()
SmartReflekt.functions<Function1<Int, Rgba>>().filter { true }.resolve()
}