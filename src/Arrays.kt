fun main() {

    /*
    Array is to store multiple items of the same data-type,such as an integer or string under a single variable name.

    Arrays are used to organize data in programming so that a related set of values can be easily sorted or searched.

    - They're stored in contiguous memory locations.
    - They can be accessed programmatically through their indexes (array[1], array[0], etc.)
    - They're mutable.
    - Their size is fixed.
     */


    val numbers = arrayOf(1, 9, 8, 3) // -> implicit type declaration
    // val numbers= arrayOf<Int>(1,9,8,3) -> Remove explicit type arguments

    println("Numbers[0] = ${numbers[0]}")

    // numbers[4] = 0 -> The size of the array is determined at first, so no new elements are added.


    /*
    Kotlin also has some built-in factory methods to create arrays of primitive data types,
    such as byteArray, intArray, shortArray, etc.
    These classes do not extend the Array class; however, they implement the same methods and properties.
     */


    // charArray
    val chars = charArrayOf('a', 'b', 'c')


    // Using the for loop to show values on the screen
    for (i in chars.indices) {
        println(chars[i])
    }
}