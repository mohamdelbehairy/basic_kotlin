fun main() {
    println("Enter the Attributes of person 1: ")
    val h1 = Human()
    h1.name = readln()
    h1.gender = readln()
    h1.length = readln().toInt()

    println("Enter the Attributes of person 2: ")
    val h2 = Human()
    h2.name = readln()
    h2.gender = readln()
    h2.length = readln().toInt()

    h1.introduce(10)
    h2.introduce(15)
}