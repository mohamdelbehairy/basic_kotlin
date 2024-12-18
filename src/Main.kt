fun main() {
    println("func1 = ${func1()}")
    println("func2 = ${func2()}")
    println("func3 = ${func3()}")
    println("func4 = ${func4(5,5)}")
}

fun func1(): Int {
    val x = 10
    val y = 10
    return (x+y)
}

fun func2(): String {
    val x = "Mohamed"
    val y = " Elbehairy"
    return (x+y)
}

fun func3(): Boolean {
    val x = 10
    val y = 5
    return (x > y)
}

fun func4(x:Int,y:Int):Int {
    return (x+y)
}
