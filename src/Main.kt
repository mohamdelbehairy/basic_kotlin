fun main() {
    val a = A(10)
    val b = A(16).B(15)
    a.printA()
    b.printB()
}

class A(x:Int) { // outer class
    private var x:Int? = null

    fun printA() {
        println("x = ${this.x}")
    }

    init {
        this.x = x
    }

   inner class B(y:Int) { // inner class
       private  var y:Int? = null

        fun printB() {
            println("y = ${this.y}")
            x = 20
            println("x = $x")
            printA()
        }
        init {
            this.y = y
        }
    }
}