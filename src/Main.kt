fun main() {
    val b = C(15)
//    b.myAge2()
}


open class A {
     var age:Int? = 10

    init {
        println("Hello from constructor A.")
    }

    fun myAge() {
        println("my age: ${this.age}")
    }
}

open class B: A {
     private var age2:Int? = 20

    fun myAge2() {
        println("age: ${super.age}")
        println("age2: ${this.age2}")
    }
    constructor() {
        println("Hello from constructor B.")

    }
    constructor(a:Int) {
        println("Hello from constructor B with $a.")

    }
}

class C(n: Int) : B(n) {
    init {
        println("Hello from constructor C.")
    }
}