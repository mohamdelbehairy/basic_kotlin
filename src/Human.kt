class Human {

    constructor(a:Int,b:Int) {
        println("$a + $b = ${a+b}")
    }

    constructor(a:Double,b:Int) {
        println("$a + $b = ${a+b}")
    }
    constructor() {
        println("sum = 0")
    }
}