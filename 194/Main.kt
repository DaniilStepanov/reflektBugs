package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Anno
import AnnoWithDefault
import C
import I


fun main() { 
SmartReflekt.classes<Anno>().filter { true }.resolve()
SmartReflekt.classes<AnnoWithDefault>().filter { true }.resolve()
SmartReflekt.classes<C>().filter { true }.resolve()
SmartReflekt.classes<I>().filter { true }.resolve()
SmartReflekt.classes<AnnoWithDefault.Nested0>().filter { true }.resolve()
SmartReflekt.classes<C.Nested1>().filter { true }.resolve()
SmartReflekt.classes<C.NestedEnum>().filter { true }.resolve()
SmartReflekt.classes<C.NestedAnno>().filter { true }.resolve()
SmartReflekt.classes<C.NestedAnno.Nested2>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}