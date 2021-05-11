package topics

fun main() {
    println(testSimple(3, 10))
    println(testString(10))

    testNamedArguments(y = 5, x = 4, z = 3)
    testNamedArguments(1, 2, 3)

    testDefaultArguments()
    testDefaultArguments(1)
    testDefaultArguments(y = 3)

    printEven(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    printEven(*intArrayOf(1, 2, 3, 4, 5), 6, 7, 8)
}

fun testSimple(x: Int, y: Int) = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z:Int): List<Int> {
    return listOf(x, y, z)
}

fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.toUpperCase() else name) + number
}

//vararg
fun printEven(vararg numbers: Int) {
    numbers.forEach { i -> if (i % 2 == 0) println(i)}
}