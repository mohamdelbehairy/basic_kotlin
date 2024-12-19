import kotlin.math.*

fun main() {
    val x = -5.0

    println("x = $x")
    println("sign(x) = ${sign(x)}")
    println("x.sign = ${x.sign}")
    println("|$x| = ${abs(x)}")

    println("floor(3.5) = ${floor(3.5)}")
    println("ceil(3.5) = ${ceil(3.5)}")
    println("round(3.5) = ${round(3.5)}")

    println("sin30 = ${sin(30.0* PI/180)}")
    println("cos30 = ${cos(60.0* PI/180)}")
    println("tan30 = ${tan(45.0* PI/180)}")
    println("sin^-1(0.5)) = ${asin(0.5)*180/ PI}")
    println("cos^-1(0.5)) = ${acos(0.5) *180/ PI}")
    println("tan^-1(1)) = ${atan(1.0) *180/ PI}")

    println("log100 = ${log(100.0,10.0)}")
    println("log10 = ${log10(10.0)}")
    println("ln10 = ${ln(10.0)}")
    println("e^3 = ${exp(3.0)}")

    println("min(2,7) = ${min(2,7)}")
    println("max(2,7) = ${max(2,7)}")
    println("sqrt(25.0) = ${sqrt(25.0)}")
    println("pow(2) = ${x.pow(2)}")
}

