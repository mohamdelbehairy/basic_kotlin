class Human(age:Int,name:String) {
    private var age:Int? = null
    private var name:String? = null

//    constructor(p:Int){
//        this.age = p
//        println("age: $age")
//    }

    init {
        this.age = age
        this.name = name
        println("age: $age")
        println("name: $name")
    }
}