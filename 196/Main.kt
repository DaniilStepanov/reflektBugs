package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import Wrapper


fun main() { 
SmartReflekt.classes<Wrapper>().filter { true }.resolve()
}