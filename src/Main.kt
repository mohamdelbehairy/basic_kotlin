fun main() {
    // immutable
    val list = listOf(2,4,6,8,10)
    val map = mapOf<Int,String>()
    val set = setOf(2,4,6,8,10)
    println(list)

    // mutable
    val listM = mutableListOf<Int>()
    listM.add(1);listM.add(2);listM.add(3);listM.add(4);listM.add(5);
    val mapM = mutableMapOf<Int,String>()
    val setM = mutableSetOf<Int>()

    val arr = ArrayList<Int>()
    arr.addAll(list) // use it to add list of elements (collection)
    println(arr)
    arr.addAll(2,set)
    println(arr)
}