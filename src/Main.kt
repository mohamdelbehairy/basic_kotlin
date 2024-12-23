fun main() {
    val b = B()
    b.myAge2()
}


open class A { // super class -> B, indirect super class c
     var age:Int? = 10

    fun myAge() {
        println("my age: ${this.age}")
    }
}

open class B: A()  { // subclass -> A, direct super class -> C
     private var age2:Int? = 20

    fun myAge2() {
        println("age: ${super.age}")
        println("age2: ${this.age2}")
    }
}

class C: B()  // subclass -> B,A