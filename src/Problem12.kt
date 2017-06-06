fun main(args: Array<String>) {
    var totalDivisors: Int = 0
    var temp = 1

    while (totalDivisors < 502){
        totalDivisors = findDivisors(generateTriangleNumber(temp)).size
        temp++
    }

    print(temp)
}

fun generateTriangleNumber(number: Int): Int{
    var sum: Int = 0
    for (i in 0..number){
        sum += i
    }
    return sum
}

fun findDivisors(number: Int): List<Int>{
    var listOfDivisors: MutableList<Int> = emptyList<Int>().toMutableList()
    listOfDivisors.add(1)
    listOfDivisors.add(number)
    for (i in 2..Math.sqrt(number.toDouble()).toInt()){
        if (number.rem(i) == 0){
            listOfDivisors.add(i)
            listOfDivisors.add(number/i)
        }
    }

    return listOfDivisors
}