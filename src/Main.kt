fun main() {
    val x = A()
    x.name1
//    x.name2
//    x.name3
    x.setName("Mohamed")
    println("My name is ${x.getName()}")
}

open class A {
    public val name1:String? = null
    private var name2:String? = null
    protected val name3:String? = null
    fun  setName(name2:String) {
        this.name2 = name2
    }
    fun getName():String? {
        return this.name2
    }

}

class B:A() {
    fun names() {
        super.name1
        super.name3
    }
}