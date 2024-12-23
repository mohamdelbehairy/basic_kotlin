fun main() {
    val h1 = Human()
    h1.name = "Mohamed"
    h1.gender = "Male"
    h1.length = 174
    println("name: "+h1.name)
    println("gender: "+h1.gender)
    println("length : "+h1.length)

    val h2 = Human()
    h2.name = "Tasneem"
    h2.gender = "Female"
    h2.length = 165
    println("name: "+h2.name)
    println("gender: "+h2.gender)
    println("length : "+h2.length)
}

class Human {
    var name:String? = null
    var gender:String? = null
    var length:Int? = null
}