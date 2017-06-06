import java.math.BigDecimal
import java.math.BigInteger

fun main(args: Array<String>) {
    val byteArray = ByteArray(126, init = {1})
    val x = BigInteger(byteArray)
    print(x.toString().length.toString() + "\n")
//    print(x)
    var sum = x.toString().fold(0, {acc, c -> acc + c.toString().toInt() })
    print(sum)
}
