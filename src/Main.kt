fun main() {
    val str = "welcome"
    println("str1: $str")
    println("str2: ${str.plus(" my friend")}")
    println("str3: ${str.hashCode()}")
    println("str4: ${str == "welcome"}") // str.equals("welcome")
    println("str5: ${str.length}")
    println("str6: ${str.count()}")
    println("str7: ${str.drop(3)}") // remove first n from str
    println("str8: ${str.take(3)}") // get first n from str
    println("str9: ${str.removeRange(2,4)}")
    println("str10: ${str.uppercase()}")
    println("str11: ${str.lowercase()}")
    println("str12: ${str.first()}")
    println("str13: ${str.last()}")
    println("str14: ${str.replace('w','W')}") // replace char
    println("str15: ${str.replace("welcome","hello")}") // replace string
    println("str16: ${str.replace("come","l")}")
}