fun main() {
    /**
     * Prefer `val` when the value does not need to change. Kotlin can infer
     * the type from the assigned value, so you usually do not write it.
     *
     * var — a mutable variable. You can assign a new value later.
     * val — a read-only variable. You cannot reassign it after initialization.
     *       It is similar to a `final` variable in Java.
     */

    var number1 = 11
    var number2 = 6

    println(number1 * number2)

    number2 = 9 // Allowed: number2 was declared with var.
    println(number2)

    val name = "Halil"
    println(name)

    // name = "Ibrahim" // Error: val cannot be reassigned.

    // You can still declare the type explicitly when it helps readers:
    val year: Int = 2026
    println(year)
}
