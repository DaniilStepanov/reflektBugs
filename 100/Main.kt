package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import FieldValue
import RequestFields
import RequestInputParameters


fun main() { 
SmartReflekt.classes<FieldValue>().filter { true }.resolve()
SmartReflekt.classes<RequestFields>().filter { true }.resolve()
SmartReflekt.classes<RequestInputParameters>().filter { true }.resolve()
}