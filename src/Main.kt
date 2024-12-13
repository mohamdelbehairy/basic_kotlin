fun main() {
    print("Enter any number: ")
    val x = readln().toInt()
    if (x > 0)
        println("x is positive.")
    else if(x < 0)
        println("x is negative.")
    else
        println("x is 0.")


    print("Enter your degree: ")
    val degree = readln().toInt()

    if(degree >= 50)
        println("ناجح")
    else {
        if(degree >= 45)
            println("ناجح بقرار")
        else
            println("راسب")
    }

}