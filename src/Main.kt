fun main() {
    println("north: ${DIRECTION.North}.")
    println("south: ${DIRECTION.South}.")
    println("east: ${DIRECTION.East}.")
    println("west: ${DIRECTION.West}.")

    println("i: ${DIRECTION.North.i}.")
    DIRECTION.West.getDir()

    DIRECTION2.North.getDir()
    DIRECTION2.South.getDir()
    DIRECTION2.East.getDir()
    DIRECTION2.West.getDir()
}

enum class DIRECTION {
    North,
    South,
    East,
    West;

    val i:Int? = null
    fun getDir() {
        println("DIRECTION.")
    }
}

enum class DIRECTION2 {
    North {
        override fun getDir() {
            println("DIRECTION IS NORTH.")
        }
    },
    South {
        override fun getDir() {
            println("DIRECTION IS SOUTH.")
        }
    },
    East {
        override fun getDir() {
            println("DIRECTION IS EAST.")
        }
    },
    West {
        override fun getDir() {
            println("DIRECTION IS WEST.")
        }
    };

    abstract fun getDir()
}