fun main() {
    var total = 0
    sum(1,6) {a,b -> total = a+b} // ==  sum(1,6,{a,b -> a+b}) == ::myFunc
  println("sum: $total")

}

fun sum(a:Int,b:Int,myFunc:(Int,Int)->Unit) {
    myFunc(a,b)
}


val lambda1 = { println("Hello from lambda1.") }
val lambda2 = {name:String -> println("My name is $name.") }
val lambda3 = {5+10}
val lambda4 = {a:Int,b:Int -> a+b}

fun myFunc(a:Int,b:Int):Int {
    return a+b
}