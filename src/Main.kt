fun main() {
   println("sum: ${ sum(1,6,lambda4)}")
}

fun sum(a:Int,b:Int,myFunc:(Int,Int)->Int):Int {
    return myFunc(a,b)
}


val lambda1 = { println("Hello from lambda1.") }
val lambda2 = {name:String -> println("My name is $name.") }
val lambda3 = {5+10}
val lambda4 = {a:Int,b:Int -> a+b}