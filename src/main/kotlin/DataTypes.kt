fun main() {
    // A variable is a named location in memory that holds a value.

    var language: String
    language = "Spanish"

    val age: Int
    age = 23

    println("$language, age $age")

    /**
     * Kotlin is statically typed: the compiler knows each variable's type.
     * Built-in types include numbers, characters, booleans, strings, and arrays.
     *
     * Signed integer and floating-point types:
     * - Byte, Short, Int, Long
     * - Float, Double
     */

    // Byte: 8-bit signed integer, from -128 to 127.
    val range: Byte = 111
    println(range)
    // val rangeOne: Byte = 199 // Error: 199 does not fit in a Byte.

    // Short: 16-bit signed integer, from -32,768 to 32,767.
    val size: Short = -12345
    println(size)

    // Int: 32-bit signed integer. This is the default type for whole numbers.
    val oldDay = 200_000 // Underscores make large literals easier to read.
    println(oldDay)

    // In IntelliJ IDEA, place the caret on a variable and press Ctrl+Shift+P (macOS: Cmd+Shift+P) to see its type.
    val goalNumber = 20
    println(goalNumber)

    // Long: 64-bit signed integer. Use the L suffix so the compiler treats the literal as Long.
    val bestScore: Long = 9999
    println(bestScore)

    val distance = 100L
    println(distance)

    // Double: 64-bit floating-point number. This is the default type for decimals.
    val salary = 5.500
    println("Salary: $salary")

    // Float: 32-bit floating-point number. Use the F suffix.
    val number = 13.24F
    println(number)

    /**
     * Number is the common supertype of the numeric types.
     * You can assign different numeric values to a Number variable over time.
     */
    var newNumber: Number = 91.19
    println(newNumber)

    newNumber = 91 // Int
    println(newNumber)

    newNumber = 1000L // Long
    println("newNumber: $newNumber")

    /**
     * Unsigned integers (UByte, UShort, UInt, ULong) hold only non-negative values.
     * They are useful when you need the extra positive range of the same bit width.
     */
    val unsignedCount: UInt = 42u
    println("unsignedCount: $unsignedCount")

    /**
     * Char stores a single character. Unlike Java, a Char is not a number.
     */
    val letter: Char = 'A'
    println(letter)
    // letter = 65 // Error: an Int is not a Char. Use Char(65) if you need a code point.

    /**
     * String is a sequence of characters. "this is a string" is a String instance.
     */
    val nameSurname = "John Martin"
    println(nameSurname)

    /**
     * Boolean has two values: true and false. It is used in conditions.
     */
    val flag = false
    println(flag)

    /**
     * Arrays are covered in the Arrays lesson. Kotlin represents them with Array
     * and with specialized primitive arrays such as IntArray.
     */
}
