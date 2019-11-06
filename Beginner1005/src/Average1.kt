import java.util.*

fun main() {

    val reader = Scanner(System.`in`)

    var A:Double = reader.nextDouble()
    var B:Double = reader.nextDouble()

    var Med:Double

    Med = ((A * 3.5) + (B * 7.5)) / 11

    println("MEDIA = %.5f".format(Med))

}