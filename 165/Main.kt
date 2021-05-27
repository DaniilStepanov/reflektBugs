package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Foo


fun main() { 
SmartReflekt.classes<Foo>().filter { true }.resolve()
}