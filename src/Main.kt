fun main() {
    val x = arrayOf(2,4,6,8,10)
    val y = ArrayList<Int>()
    y.add(1);y.add(3);y.add(5);y.add(7);y.add(9)

    // for statement
    for (i in x) {
        println("for x: $i")
    }
    for (i in y) {
        println("for y: $i")
    }

    // forEach expression
    x.forEach {  println("forEach x : $it") }
    y.forEach {  println("forEach x : $it") }
}