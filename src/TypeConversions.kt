fun main() {

    /**
    In Kotlin, a numeric value of one type is not automatically converted to another type even when the other type is larger.
    This is different from how Java handles numeric conversions.

    Here's a list of functions in Kotlin used for type conversion:

    toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()

    Note: There is no conversion for Boolean types.
     */

    // String Value
    val string1: String = "54"

    // convert String to Int
    val number2: Int = string1.toInt()

    // "54"+11 = 5411
    println("number1 = ${string1 + 11}")

    // 54 + 11 = 65
    println("number2 = ${number2 + 11}")

    // smaller types are NOT implicitly converted to bigger types.
    // This means that we cannot assign a value of type Byte to an Int variable without an explicit conversion

    /*
    val b: Byte = 1 // OK, literals are checked statically
    val i: Int = b // Type mismatch.
    */
}