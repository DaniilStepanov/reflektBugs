package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import En
import Z1
import Z2
import ZN


fun main() { 
SmartReflekt.classes<En>().filter { true }.resolve()
SmartReflekt.classes<Z1>().filter { true }.resolve()
SmartReflekt.classes<Z2>().filter { true }.resolve()
SmartReflekt.classes<ZN>().filter { true }.resolve()
SmartReflekt.functions<Function1<En, Z1>>().filter { true }.resolve()
SmartReflekt.functions<Function1<En, Z2>>().filter { true }.resolve()
SmartReflekt.functions<Function1<En, ZN>>().filter { true }.resolve()
}