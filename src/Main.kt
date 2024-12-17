fun main() {
    val arr = arrayOf(58,5,15,3,25,99,1,6)
    println("arr: ${arr.toList()}")

    println("max element: ${arr.max()}")
    println("min element: ${arr.min()}")
    println("count element: ${arr.count()}")
    println("size element: ${arr.size}")
    println("first element: ${arr.first()}")
    println("last element: ${arr.last()}")

    println("set element: update index 3 by the value 333")
    arr.set(3,333)  // arr[3] = 333
    println("get element: ${arr.get(3)}") // arr[3]

    arr.sort()
    println("sort element: ${arr.toList()}")

    for (i in 0 until arr.size) {
        println("arr[$i] = ${arr[i]}")
    }
}