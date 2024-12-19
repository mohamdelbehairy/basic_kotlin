fun main() {
    print("Enter a positive integer: ")
    val x = readln().toInt()
    println("sum = ${add(x)}")
}

fun add(c:Int):Int {
    return if(c != 0) c + add(c-1) // 5 + 4 + 3 + 2 + 1 => 15
    else 0
}

