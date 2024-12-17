fun main() {
    val x = ArrayList<Int>()
    x.add(3);x.add(5);x.add(4);x.add(3);x.add(6)

    println("x: $x")
    println("size: ${x.size}")
    println("last index of (3): ${x.lastIndexOf(3)}") // بيعرف اخر انديكيس للعنصر بتاعي عشان لو موجود اكتر من مره
    println("first: ${x.first()}")
    println("last: ${x.last()}")
    println("index of: ${x.indexOf(6)}")
    println("x is empty: ${x.isEmpty()}")
    println("x is not empty: ${x.isNotEmpty()}")
    println("x is contains(4): ${x.contains(4)}")
    println("x is contains(7): ${x.contains(7)}")
    x[2] = 7 // x.set(2,7)
    println("x: $x")
    x.toArray()
    println("x: $x")
    x.clear()
    println("size: ${x.size}")
}