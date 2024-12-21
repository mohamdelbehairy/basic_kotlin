fun main() {
    func1()
    lambda1()

    func2("Mohamed Elbehairy")
    lambda2("Mohamed Elbehairy")

    println(func3())
    println(lambda3())

    println(func4(10,5))
    println(lambda4(10,5))
}
 // one
fun func1() {
    println("Hello from func1.")
}

val lambda1 = { println("Hello from lambda1.") }

// two

fun func2(name:String) {
    println("My name is $name.")
}

val lambda2 = {name:String -> println("My name is $name.") }

// three
fun func3():Int {
    return (5+10)
}

val lambda3:()-> Int = {5+10}

// four
fun func4(a:Int,b:Int):Int {
    return (a*b)
}

val lambda4:(Int,Int)-> Int = {a:Int,b:Int -> a*b}