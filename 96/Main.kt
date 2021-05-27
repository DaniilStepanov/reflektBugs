package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import EntityBase
import EntityId
import Entity
import EntityStub


fun main() { 
SmartReflekt.classes<EntityId>().filter { true }.resolve()
SmartReflekt.classes<Entity>().filter { true }.resolve()
SmartReflekt.classes<EntityStub>().filter { true }.resolve()
SmartReflekt.functions<Function0<EntityId>>().filter { true }.resolve()
}