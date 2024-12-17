fun main() {
    val x = arrayOf("Mohamed",2,'^',5.5,true)

//    println("#################")
//    for (i in 0 until  x.size) {
//        println("x[$i] = ${x[i]}")
//    }

    println("Enter the value of array: ")
    for (i in 0 until x.size) {
        x[i] = readln()
    }
    for (i in x) {
        println(i)
    }
}