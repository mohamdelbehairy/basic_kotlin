fun main() {
    print("Enter any number: ")
    val x = readln().toInt()

    when(x) {
        0-> {
            println("x is 0.")
        }
        1-> {
            println("x is 1.")
        }
        else-> {
            println("unknown!")
        }
    }

    print("Enter your name: ")
    val name = readln()

    when(name) {
        "Mohamed"-> {
            println("Accepted.")
        }

        else-> {
            println("Only admin can login.")
        }
    }
}