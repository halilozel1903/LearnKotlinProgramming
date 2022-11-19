fun main() {
    /*
    var (Mutable Reference) - The variable declared using var keyword can be changed later in the program.
     It corresponds to regular Java variable.
     */

    var number1 = 11
    var number2 = 6

    println(number1 * number2)

    number2 = 9 // number2 was changed because Mutable Reference

    println(number2)

    /*
    val (Immutable Reference) - The variable declared using val keyword cannot be changed once the value is assigned.
    It is similar to final variable in Java.
     */

    val name = "Halil"

    println(name)

    // name ="Ibrahim" -> Error because val is Immutable Reference
}