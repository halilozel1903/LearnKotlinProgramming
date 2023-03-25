fun main() {

    // As you know, a variable is a location in memory (storage area) to hold data.

    // variable declaration of type String
    var language: String

    // variable initialization
    language = "Spanish"

    // variable declaration of type Int
    val age: Int

    // variable initialization
    age = 23


    /**
    Kotlin is a statically typed language like Java.
    That is, the type of a variable is known during the compile time.
     */


    /**
        The built-in types in Kotlin can be categorized as :
        - Numbers
        - Characters
        - Booleans
        - Arrays

     */


    /**
    There are 6 built-in types representing numbers.
        - Byte
        - Short
        - Int
        - Long
        - Float
        - Double
     */


    // 1) Byte -> The Byte data type can have values from -128 to 127 (8-bit signed two's complement integer).

    val range: Byte = 111
    println("$range")

    // val rangeOne: Byte = 199 -> The integer literal does not conform to the expected type Byte


    // 2) Short -> The Short data type can have values from -32768 to 32767 (16-bit signed two's complement integer).

    val size: Short = -12345
    println("$size")


    // 3) Int -> The Int data type can have values from -2^31 to (2^31)-1 (32-bit signed two's complement integer).

    val oldDay: Int = 200000 // Explicitly given type is redundant here
    println(oldDay)


    // If you're using IntelliJ IDEA you can place cursor inside the variable and press (Ctrl + Shift + P) to see its type.
    val goalNumber = 20
    println(goalNumber)


    // 4) Long -> The Long data type can have values from -2^63 to (2^63)-1 (64-bit signed two's complement integer).

    val bestScore: Long = 9999
    println("$bestScore")

    // distance value of type Long
    val distance = 100L


    // 5) Double -> The Double type is a double-precision 64-bit floating point.

    // distance is of type Double
    val salary = 5.500
    println("Salary : $salary")


    // 6) Float -> The Float data type is a single-precision 32-bit floating point.

    // To tell compiler to treat 19.5 as Float, you need to use F at the end.
    val number = 13.24F
    println(number)


    /**
    If you are not sure what number value a variable will be assigned in the program, you can specify it as Number type.
    This allows you to assign both integer and floating-point value to the variable (one at a time).
     */


    // Number : Superclass for all platform classes representing numeric values.
    var newNumber: Number = 91.19
    println(newNumber)


    // Int smart cast from Number
    newNumber = 91
    println("$newNumber")


    // Long smart cast from Number
    newNumber = 1000L
    println("newNumber : $newNumber")


    /**
    Char : To represent a character in Kotlin, Char types are used.
    Unlike Java, Char types cannot be treated as numbers.
     */

    val letter: Char = 'A'
    println(letter)

    // letter = 65 -> The integer literal does not conform to the expected type Char


    /**
    String : In Kotlin, strings are represented by the String class.
    The string literals such as "this is a string" is implemented as an instance of this class.
     */

    val nameSurname: String = "John Martin"
    println(nameSurname)


    /**
    Boolean : The Boolean data type has two possible values, either true or false.
     */


    // Booleans are used in decision-making statements.
    val flag = false
    println("$flag")


    /**
    Arrays : In Kotlin, arrays are represented by the Array class.
    The class has get and set functions, size property and a few other useful member functions.
    To learn in detail about arrays next lessons -> coming soon
     */
}