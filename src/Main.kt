fun main() {

//    for (x in 1..10) {
//        println("x: $x")
//        continue
//    }
//    for (x in 1..10) {
//        for (y in 1..10) {
//            println("$x * $y = ${x*y}")
//            break
//        }
//    }

    // بقدر احط اسماء للفورلوب واعمله كونتنيو او بريك عن طريق الاسم
    loop1@for (x in 1..10) {

        if (x == 5)break@loop1
        println("x: $x")
    }
    loop2@for (x in 1..10) {
        loop3@for (y in 1..10) {

            if(y == 5) break@loop3 // == if(y == 5) continue@loop2
            println("$x * $y = ${x*y}")
        }
    }
}