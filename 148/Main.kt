package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Foo
import Foo2


fun main() { 
SmartReflekt.classes<Foo>().filter { true }.resolve()
SmartReflekt.classes<Foo2>().filter { true }.resolve()
}