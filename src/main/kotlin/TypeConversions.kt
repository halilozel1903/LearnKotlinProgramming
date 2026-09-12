fun main() {
    /**
     * Kotlin does not convert numeric types automatically, even from a smaller
     * type to a larger one. You convert values with explicit functions:
     *
     * toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble()
     *
     * There is no Boolean conversion.
     * Number.toChar() was removed; use Char(code) when you need a character
     * from a Unicode code point.
     */

    val string1 = "54"
    val number2 = string1.toInt()

    // String + Int concatenates: "54" + 11 becomes "5411".
    println("number1 = ${string1 + 11}")

    // Int + Int adds: 54 + 11 becomes 65.
    println("number2 = ${number2 + 11}")

    // Safer parsing: toIntOrNull() returns null instead of throwing
    // when the text is not a valid integer.
    val maybeNumber = "not-a-number".toIntOrNull()
    println("maybeNumber = $maybeNumber")

    /*
    val b: Byte = 1 // OK: integer literals are checked at compile time.
    val i: Int = b  // Error: type mismatch. Use b.toInt() instead.
    */

    val byteValue: Byte = 1
    val intValue: Int = byteValue.toInt()
    println("intValue = $intValue")

    val codePoint = 65
    println("Char from code point: ${Char(codePoint)}")
}
