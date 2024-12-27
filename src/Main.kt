fun main() {
    val a = A()
    a.draw()

    val x = object :AA() {
        override fun draw() {
            println("Hi from Anonymous class.")
        }
    }

    x.draw()
}

class A:AA() {
    override fun draw() {
        println("Hi from class A.")
    }
}

abstract class AA {
    abstract fun draw()
}
