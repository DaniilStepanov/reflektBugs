package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import IcInt
import IcLong
import IcAny
import IcOverIc


fun main() { 
SmartReflekt.classes<IcInt>().filter { true }.resolve()
SmartReflekt.classes<IcLong>().filter { true }.resolve()
SmartReflekt.classes<IcAny>().filter { true }.resolve()
SmartReflekt.classes<IcOverIc>().filter { true }.resolve()
SmartReflekt.functions<Function4<IcInt, IcLong, IcAny, IcOverIc, String>>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}