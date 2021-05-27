package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Season
import A


fun main() { 
SmartReflekt.classes<Season>().filter { true }.resolve()
SmartReflekt.classes<A>().filter { true }.resolve()
SmartReflekt.functions<Function1<Season, String>>().filter { true }.resolve()
}