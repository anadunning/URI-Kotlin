import java.util.*

fun main() {

    val pi = 3.14159
    val reader = Scanner(System.`in`)

    var r:Double = reader.nextDouble()
    var a:Double

    a = pi * r * r

    println("A=%.4f".format(a))
}