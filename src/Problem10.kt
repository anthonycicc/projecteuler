fun main(args: Array<String>) {
    var sum: Long = 0;
    for (i in 2..2000000){
        if (isPrime(i)){
            sum += i
        }
    }

    print(sum)

}