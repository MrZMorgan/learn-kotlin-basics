package topics

fun main() {

    val items = listOf("apple", "banana", "orange") //List.of() java 9

//    mutableListOf("apple", "banana", "orange") //ArrayList

    for (item in items) {
        println(item)
    }

    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    //Диапазоны
    for (digit in  3..15) {
        println(digit)
    }

    println(5 in 3..15)

    for (digit in 3 until 15) {
        println(digit)
    }

    for (digit in 10 downTo 1) {
        println(digit)
    }

    for (digit in 0..100 step 10) {
        println(digit)
    }
}