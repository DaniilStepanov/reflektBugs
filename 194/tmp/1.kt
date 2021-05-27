import kotlin.reflect.*

annotation class Anno(
    val k: KClass<*>,
    val e: C.NestedEnum,
    val a: C.NestedAnno,
)

annotation class AnnoWithDefault(val k: KClass<*> = Nested0::class) {
    class Nested0
}

class C {
    class Nested1

    enum class NestedEnum { E }

    annotation class NestedAnno(val k: KClass<*>) {
        class Nested2
    }
}

interface I {
    @Anno(
        C.Nested1::class,
        C.NestedEnum.E,
        C.NestedAnno(C.NestedAnno.Nested2::class),
    )
    @AnnoWithDefault
    fun foo(): String = "OK"
}