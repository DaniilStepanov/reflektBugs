package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import MyException
import ExecutionType
import TestLocal


fun main() { 
SmartReflekt.classes<MyException>().filter { true }.resolve()
SmartReflekt.classes<ExecutionType>().filter { true }.resolve()
SmartReflekt.classes<TestLocal>().filter { true }.resolve()
SmartReflekt.functions<Function1<ExecutionType, String>>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}