fun main() {
    val b = B()
    b.myAge()
}


open class A {
    private var age:Int? = null

    fun myAge() {
        this.age = 10
        println("my age: ${this.age}")
    }
}

open class B: A()

class C: B()