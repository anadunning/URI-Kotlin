import java.util.*

fun main() {

    val reader = Scanner(System.`in`)

    var A:Double = reader.nextDouble()
    var B:Double = reader.nextDouble()
    var C:Double = reader.nextDouble()

    var Med:Double

    Med = ((A * 2) + (B * 3) + (C * 5)) / 10;

    println("MEDIA = %.1f".format(Med))
}