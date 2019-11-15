import java.util.*

fun main() {

    val reader = Scanner(System.`in`)

    var num:Int = reader.nextInt()
    var hours:Int = reader.nextInt()
    var salary:Double = reader.nextDouble()

    println("NUMBER = $num")
    println("SALARY = U$ %.2f".format(hours * salary))
}