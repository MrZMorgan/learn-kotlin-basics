package topics

fun main() {
    val child: Person = Person("Guinea", "Pig", 5)
    val p1 = Person("Egor", "Anchutin", 27, child)
    println(p1.firstName)

    val rectangle1 = Rectangle(5.0, 2.0)
    println(rectangle1.perimeter)

    val rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle2.perimeter)

    println(rectangle1 == rectangle2)
}

//Первичный конструктор
class Person (val firstName: String,
              val lastName: String,
              var age: Int) {

    var children: MutableList<Person> = mutableListOf(); //Array list

    init {
        println("Person $firstName $lastName is created")
    }

    constructor(firstName: String,
                lastName:
                String, age:
                Int, child: Person):this(firstName, lastName, age) {
        children.add(child);
    }

    constructor():this("", "", -1)
}

data class Rectangle(var heigth: Double, var length: Double) {
    var perimeter = (heigth + length) * 2

    var test = 1
        get() = field + 1;
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = heigth * length
}
