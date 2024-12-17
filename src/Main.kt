fun main() {
    val x = Array(3) {0} // immutable غير قابله للتعديل
    val y = ArrayList<Int>() // mutable قابله للتعديل

    x[0] = 1
    y.add(3)
    y.add(1,5)
    println("y: $y")
    y.removeAt(1) // remove index
    y.remove(3) // remove element
    println("y: $y")
    y.add(5)
    y.add(6)
    println("y: $y")
    y.clear() // clear array list
    println("y: $y")
}