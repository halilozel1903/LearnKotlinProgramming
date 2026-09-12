fun main() {
    /**
     * An array stores several values of the same type under one name.
     *
     * - Elements live in a single contiguous block of memory.
     * - You read and write them by index: array[0], array[1], ...
     * - The contents are mutable.
     * - The size is fixed after the array is created.
     */

    val numbers = arrayOf(1, 9, 8, 3)
    println("Numbers[0] = ${numbers[0]}")

    // numbers[4] = 0 // Error at runtime: the array has only four elements.

    numbers[1] = 42
    println("Numbers[1] = ${numbers[1]}")

    /**
     * Primitive arrays (IntArray, CharArray, ByteArray, and so on) avoid boxing.
     * They do not extend Array<T>, but they offer the same index access and size.
     */
    val chars = charArrayOf('a', 'b', 'c')

    // Iterating the values directly is the usual Kotlin style.
    for (char in chars) {
        println(char)
    }

    // indices is useful when you also need the position.
    for (index in chars.indices) {
        println("chars[$index] = ${chars[index]}")
    }

    // Array(size) { ... } builds each element from its index.
    val squares = Array(5) { index -> index * index }
    println(squares.joinToString())
}
