fun main() {
    val a = A()
    a.myFunc(Shape())
    a.myFunc(Circle())
    a.myFunc(Rectangle())
    a.myFunc(Square())
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
    fun printVara() {
        println("Rectangle")
    }
}

class Square: Shape() {
    override fun printVar() {
        println("Square")
    }
}

class A {
    fun myFunc(a:Shape) {
        a.printVar()
    }
}