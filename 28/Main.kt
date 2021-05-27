package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import BigEnum


fun main() { 
SmartReflekt.classes<BigEnum>().filter { true }.resolve()
SmartReflekt.functions<Function1<BigEnum, String>>().filter { true }.resolve()
}