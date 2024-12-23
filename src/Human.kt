class Human {
    var name:String? = null
    var gender:String? = null
    var length:Int? = null

    fun introduce(a:Int) {
        this.length  = this.length?.plus(a)
        println("My name is "+this.name+".")
        println("I am "+this.gender+".")
        println("My length is ${this.length} cm.")
    }

//    fun  name() {
//        println("My name is "+this.name+".")
//    }
//    fun  gender() {
//        println("I am "+this.gender+".")
//    }
}