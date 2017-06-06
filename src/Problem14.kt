fun main(args: Array<String>) {
    var maxLength: Int = 0
    for (i in 2..1000000){
        var tempI: Long = i.toLong()
        var length = 0
        while (collatz(tempI) != 1L){
            tempI = collatz(tempI)
            length++
        }
        if (length > maxLength){
            print(i.toString() + " : ")
            maxLength = length
        }
    }
    print(maxLength)
}

fun collatz(input: Long): Long{
    if (input.rem(2) == 0L){
        return input/2
    }
    else return (input * 3) + 1
}