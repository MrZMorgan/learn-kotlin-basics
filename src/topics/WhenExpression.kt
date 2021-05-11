package topics

fun main() {
    testWhen(1)
    testWhen(2)
    testWhen("Hello")
}

fun testWhen(input: Any) {
    when(input) {
        1 -> println("Единица")
        2 -> println("Двойка")
        in 10..20 -> println("От 10 до 20")
        is String -> println("Была введена строка длиной ${input.length} символов")
        else -> println("Что-то еще")
    }
}