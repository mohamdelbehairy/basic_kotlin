fun main() {
    val  h1 = Shape()
    val  h2 = Circle()
    val  h3 = Rectangle()
    val  h4 = Square()

    val arr = arrayOf(h1,h2,h3,h4)
    val list = mutableListOf(h1,h2,h3,h4)
    for (i in list) {
        i.printVar()
    }
}


open class Shape {
    open fun printVar() {
        println("Shape")
    }
}

class Circle: Shape() {

    override fun printVar() {
       println("Circle")
    }
}

class Rectangle: Shape() {
    override fun printVar() {
        println("Rectangle")
    }
}

class Square: Shape() {
    override fun printVar() {
        println("Square")
    }
}