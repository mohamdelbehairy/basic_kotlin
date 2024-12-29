fun main() {
    val a = Hello()
    val b = World()
    a.start(); b.start()
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