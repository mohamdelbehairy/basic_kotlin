fun main() {
    val a = A<Double>()
    a.x = 11.5
    val b = A<Int>()
    b.x = 10
    println(a.x)
    println(b.x)
}

class A<T> {
    var x:T? = null
}