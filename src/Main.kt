fun main() {
    val x = IntArray(3) // first way to make array
    x[0] = 1
    x[1] = 2
    x[2] = 3
    println("x = ${x.toList()}")

    val y = Array(3) {0} // second way to make array
    // {} => initial value of array
    // 0 => make type of array int, 0.0 => make type of array double, "" => make type of array string
    y[0] = 4
    y[1] = 5
    y[2] = 6
    println("y = ${y.toList()}")

    val z = Array<Int>(3){0} // third way to make array
    z[0] = 7
    z[1] = 8
    z[2] = 9
    println("z = ${z.toList()}")

    val a = arrayOf(10,11,12) // best way
    println("a = ${a.toList()}")

    val b = arrayOf("Mohamed","Ahmed",12,10.5,true)
    println("a = ${b.toList()}")
}