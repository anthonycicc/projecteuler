import java.io.FileReader

fun main(args: Array<String>) {
    val reader = FileReader("C:\\Users\\speed\\projecteuler\\src\\p022_names.txt")

    val sortedList = reader.readText().split(",")
            .map { it -> it.substring(1..it.length-2) }
            .sorted()

    var returnVal = 0
    for ((index, i) in sortedList.withIndex()){
        returnVal += (index + 1) * i.value()
    }

    print(returnVal)
}

fun String.value(): Int = this.fold(0, { acc, c -> acc + c.value()})

fun Char.value(): Int = this.toInt() - 64