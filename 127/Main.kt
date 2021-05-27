package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Ann
import Ann2
import MyEnum
import A
import MyClass


fun main() { 
SmartReflekt.classes<Ann>().filter { true }.resolve()
SmartReflekt.classes<Ann2>().filter { true }.resolve()
SmartReflekt.classes<MyEnum>().filter { true }.resolve()
SmartReflekt.classes<A>().filter { true }.resolve()
SmartReflekt.classes<MyClass>().filter { true }.resolve()
}