package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import ResultType


fun main() { 
SmartReflekt.classes<ResultType>().filter { true }.resolve()
SmartReflekt.functions<Function1<String, ResultType>>().filter { true }.resolve()
}