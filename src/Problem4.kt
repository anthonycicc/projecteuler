fun main(args: Array<String>) {
    val productList: MutableSet<Int> = emptySet<Int>().toMutableSet()

    for (i in 0..1000){
        for (j in i..1000){
            productList.add(i*j)
        }
    }

    print(productList.filter { isPalindrome(it) }.max())
}

fun isPalindrome(candidate: Int): Boolean{
    return candidate.toString().reversed() == candidate.toString()
}