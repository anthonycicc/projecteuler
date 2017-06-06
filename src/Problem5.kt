fun main(args: Array<String>){
    var count: Int = 0;
    var prime: Int = 1;
    while (count < 10001) {
        prime++
        if (isPrime(prime)) {
            count++
        }
    }
    print(prime)
}

fun isPrime(candidate: Int): Boolean{
    for (i in 2..Math.sqrt(candidate.toDouble()).toInt()){
        if (candidate.rem(i)==0) return false
    }
    return true
}