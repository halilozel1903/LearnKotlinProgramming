fun main() {
    /**
     * Functions group reusable logic under a name. Kotlin uses fun to declare them.
     * This lesson covers parameters, return values, default arguments, and
     * single-expression functions — idioms you will use in every Kotlin program.
     */

    greet("Ada")
    greet("Grace", punctuation = "!!!")

    val sum = add(14, 28)
    println("sum = $sum")

    println("double(7) = ${double(7)}")

    printNumbers(1, 2, 3, 4)

    val message = buildGreeting(name = "Kotlin", year = 2026)
    println(message)

    println("isEven(4) = ${isEven(4)}")
    println("isEven(7) = ${isEven(7)}")
}

fun greet(name: String, punctuation: String = ".") {
    println("Hello, $name$punctuation")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun double(n: Int): Int = n * 2

fun printNumbers(vararg numbers: Int) {
    for (n in numbers) {
        print("$n ")
    }
    println()
}

fun buildGreeting(name: String, year: Int): String {
    return "Welcome to $name in $year"
}

fun isEven(n: Int): Boolean = n % 2 == 0
