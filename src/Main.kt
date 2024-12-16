fun main() {
    print("Enter your degree: ")
    val degree = readln().toInt()

//    if (degree >= 90) println("A")
//    else if (degree in 80..89) println("B")
//    else if(degree in 70..79) println("C")
//    else if (degree in 60..69) println("D")
//    else if(degree in 50..59) println("E")
//    else println("F")

    when {
        degree >= 90 -> {
            if(degree > 94) {
                println("A+")
            } else {
                println("A-")
            }
        }
        degree in 80..89 ->  {
            if(degree > 84) {
            println("B+")
        } else {
            println("B-")
        }}
        degree in 70..79 -> {
            if(degree > 74) {
                println("C+")
            } else {
                println("C-")
            }
        }
        degree in 60..69 -> {
            if(degree > 64) {
                println("D+")
            } else {
                println("D-")
            }
        }
        degree in 50..59 -> {
            if(degree > 54) {
                println("E+")
            } else {
                println("E-")
            }
        }
        else -> println("F")
    }
}