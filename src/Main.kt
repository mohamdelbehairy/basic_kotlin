fun main() {
    val a = Operation()
    a.sum(2,2)
    a.sub(2,2)
}

interface Sum {
    fun sum(a:Int,b:Int)
}

interface Sub {
    fun sub(a:Int,b:Int)
}

class Operation:Sum,Sub {
    override fun sum(a: Int, b: Int) {
        println("$a + $b = ${a+b}")
    }

    override fun sub(a: Int, b: Int) {
        println("$a - $b = ${a-b}")
    }


}