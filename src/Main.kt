fun main() {
    val a = Hello()
    val b = World()
    a.start(); b.start()
    println(a.isAlive)
    println(b.isAlive)
    a.join(); b.join()
    println(a.isAlive)
    println(b.isAlive)
    println("End.")
}

class Hello: Thread() {
   override fun run() {
        for (i in 0..5) {
            println("Hello")
            sleep(500)
        }
    }
}

class World: Thread(){
   override fun run() {
        for (i in 0..5) {
            println("World")
            sleep(500)
        }
    }
}