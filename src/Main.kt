fun main() {

   loop1@while (true) {
       try {
           print("Enter you age: ")
           val age = readln().toInt()
           println("your age is $age years")
           break@loop1
       } catch (e:Exception) {
           println("You entered wrong value.")
           continue@loop1
       }
   }

    println("Done!")
}