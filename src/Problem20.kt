import java.math.BigInteger

fun main(args: Array<String>) {
    val fac = fact(100).toString()
    var mawp = BigInteger.ZERO
    for (i in fac){
        mawp += BigInteger(i.toString())
    }
    print(mawp)
}

fun fact(x: Int): BigInteger {
    var returnVal = BigInteger.ONE
    for (i in 1..x) {
        returnVal *= BigInteger(i.toString())
    }
    return returnVal
}