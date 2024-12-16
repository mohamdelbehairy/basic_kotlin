fun main() {
    while (true) {
        print("Enter your degree: ")
        val degree = readln().toInt()

        if(degree !in 0..100)break

        if (degree >= 90) println("A")
        else if (degree in 80..89) println("B")
        else if(degree in 70..79) println("C")
        else if (degree in 60..69) println("D")
        else if(degree in 50..59) println("E")
        else println("F")
    }
}