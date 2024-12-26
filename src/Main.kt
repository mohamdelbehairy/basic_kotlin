fun main() {
    A.x = 10
    A.y = 12
    A.sum()

    B.x = 15
    B.y = 20
    B.sum()
}

object A {
    var x:Int? = null
    var y:Int? = null

    fun sum() {
        println("$x + $y = ${x!!+y!!}")
    }
}

class B {
    companion object {
        var x:Int? = null
        var y:Int? = null

        fun sum() {
            println("$x + $y = ${x!!+y!!}")
        }
    }
}