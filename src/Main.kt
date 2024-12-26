fun main() {
    val c = Circle()
    c.setName(name = "Circle")
}


//abstract class Shape {
//    abstract fun setName(name:String)
//}

interface  Shape {
    fun setName(name:String)
}

class Circle: Shape {
    override fun setName(name:String) {
       println(name)
    }
}
