import java.util.*

fun main() {

    val reader = Scanner(System.`in`)

    var code1:Int = reader.nextInt()
    var qtde1:Int = reader.nextInt()
    var price1:Double = reader.nextDouble()

    var code2:Int = reader.nextInt()
    var qtde2:Int = reader.nextInt()
    var price2:Double = reader.nextDouble()

    var total:Double

    total = (qtde1 * price1) + (qtde2 * price2)


    println("VALOR A PAGAR: R$ %.2f".format(total))
}