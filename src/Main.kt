fun main() {
    val arr1 = Array(1) {0}
    val arr2 = Array(10,::myFunc)
    val arr3 = Array(1,lambda)

    println(arr1.toList())
    println(arr2.toList())
    println(arr3.toList())
}

fun myFunc(a:Int):Int {
    return a + 1
}

val lambda = {a:Int -> "Hello"}