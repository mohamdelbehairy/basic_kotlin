fun main() {


    for (x in 1..10) {
        for (y in 1..10) {
            println("$x * $y = ${x * y}")
        }
    }
    //بيستخدم لعرض عناصر مصفوفه معينه
    val x = "welcome"
    for (i in x) {
        println("Char: $i")
    }
}