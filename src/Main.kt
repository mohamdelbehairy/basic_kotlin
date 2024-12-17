fun main() {
    val map = mapOf(Pair(1,"A"), Pair(2,"B"),Pair(3,"C"))
    val mapM = mutableMapOf<Int,String>()
    mapM[0] = "a" // mapM.set(0,"a") || mapM.put(4,"e")
    mapM[1] = "b";mapM[2] = "c"
    mapM[44] = "z"

    println("map: $map")
    println("mapM: $mapM")
    mapM.replace(44,"e")
    println("mapM: $mapM")

    val c = HashMap<Int,String>() // mutableMapOf
    c[0] = "a"; c[1] = "b";c[2] = "c";c[44] = "z"

    println("c: $c")
}