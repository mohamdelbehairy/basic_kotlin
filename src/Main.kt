fun main() {

   loop@while (true) {
       try {
           println("Enter two numbers: ")
           val num1 = readln().toInt()
           val num2 = readln().toInt()
           println("$num1 / $num2 = ${num1/num2}")
           break@loop
       } catch (e:NumberFormatException) {
           println("Please enter integer number.")
           println("Try again...")
           continue@loop
       }
       catch (e:ArithmeticException) {
           println("Please do not divide number by zero.")
           println("Try again...")
           continue@loop
       }
       catch (e:Exception) {
           println("You entered wrong value.")
           continue@loop
       }
   }
}

