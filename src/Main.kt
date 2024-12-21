fun main() {
    val name = "Mohamed"

    println(name.reversed())
    println(funcRevers(name))
    println(lambdaReverse(name))
    higherFunc(name,::funcRevers)
    higherFunc(name,lambdaReverse)
    higherFunc(name) {word:String-> word.reversed()}
    higherFunc(name) {it.reversed()}
}

fun higherFunc(word:String,myFunc:(String)->String) {
   println( myFunc(word))
}

fun funcRevers(word:String):String {
    return word.reversed()
}

val lambdaReverse = {word:String-> word.reversed()}