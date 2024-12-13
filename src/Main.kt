import java.util.Calendar

fun main() {
    print("Enter your birth year: ")

    val birthYear = readln().toInt()

    val age = Calendar.getInstance().get(Calendar.YEAR) - birthYear

    println("Your age is $age years ago.")
}