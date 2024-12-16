fun main() {
    println("Enter any two numbers:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    println("num1 > num2 : ${num1>num2}")
    println("num1 < num2 : ${num1<num2}")
    println("num1 == num2 : ${num1==num2}")
    println("num1 >= num2 : ${num1>=num2}")
    println("num1 <= num2 : ${num1<=num2}")

    println("num1 > 9 && num2 > 2 : ${num1>9 && num2>2}")
    println("num1 > 9 || num2 > 2 : ${num1>9 || num2>2}")
    println("num1 != num2 : ${num1!=num2}")
}