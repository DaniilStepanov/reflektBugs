package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import test.IssueState


fun main() { 
SmartReflekt.classes<test.IssueState>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}