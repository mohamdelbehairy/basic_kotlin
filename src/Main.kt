fun main() {
    var x = 1

    while (x <= 10) {
        var y = 1
        while (y <= 10) {
            println("$x * $y = ${x*y}")
            y++
        }
        x ++
    }

    var z = 1
    do {
        var y = 1
        do {
            println("$z * $y = ${z*y}")
            y++
        } while (y <= 10)
        z ++
    } while (z <= 10)
}