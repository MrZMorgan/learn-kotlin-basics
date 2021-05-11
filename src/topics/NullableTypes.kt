package topics

fun main() {
    var a: String = "Hello"

//    a = null // NPE исключено

    var b: String? = "Test"
    b = null

    b?.length //safeCall Вернет длину -> Если нет то вернет null

    //Elvis оператор
    val l = b?.length ?: -1


    //!! - выбрасывает NPE если null
    b = if ((0..10).random() > 5) "asd" else null
    val t = b!!.length
}