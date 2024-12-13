fun main() {
    print("Enter your name: ")
    val name = readlnOrNull()
    println("Your name is $name.")

    print("Enter your age: ")
    val age = readlnOrNull()!!.toInt()
    println("Your age is $age.")
}