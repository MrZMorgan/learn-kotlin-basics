package topics

fun main() {
    val a = listOf(1, 2, 3, 4, 5)

    a.forEach {i ->  println(i)}
    println(a.map { i -> i*2 })
    println(a.filter { i -> i%2 == 0 })
    println(a.reduce {acc, i -> acc + i})

    a.sortedByDescending { it }

    a.any {it > 10}

    a.all {it < 10}

    a.sum()

    val numbers = listOf(1, 3, -4, 2, -11)

    val (positive, negative) = numbers.partition { it > 0 }

    val result = listOf("a", "b", "asd", "as", "asdasd").groupBy { it.length } //Hashmap
    println(result)

}
