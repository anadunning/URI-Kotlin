
import java.util.*

fun main() {

    val reader = Scanner(System.`in`)

    var name:String = reader.nextLine()
    var salary:Double = reader.nextDouble()
    var bonus:Double = reader.nextDouble()

    salary += (bonus * 0.15)

    println("TOTAL = R$ %.2f".format(salary))
}