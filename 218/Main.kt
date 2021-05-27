package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import AsAny
import AsInt


fun main() { 
SmartReflekt.classes<AsInt>().filter { true }.resolve()
SmartReflekt.functions<Function1<AsInt, AsInt>>().filter { true }.resolve()
}