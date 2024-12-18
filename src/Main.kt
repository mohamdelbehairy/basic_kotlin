fun main() {
//    val x:Array<Any> = arrayOf(2,"mohamed",'@',10.5,true)
    val y = ArrayList<Any>()
    input(y,5);output(y)
}


fun input(x:ArrayList<Any>,size:Int) {
    println("Enter the elements of array: ")
//    for (i in x.indices) {
//        x[i] = readln()
//    }
    for (i in 0..< size) {
        x.add(readln())
    }
}

fun output(x:ArrayList<Any>) {
    for (i in x.indices) {
        println("x[$i] = ${x[i]}")
    }
}