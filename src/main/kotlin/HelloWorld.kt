fun main() {
    /**
     * A "Hello World" program prints a short message to the screen.
     * It is often the first program people write when they learn a new language.
     *
     * In Kotlin, `fun main()` is the entry point. The `args: Array<String>`
     * parameter is optional when the program does not read command-line arguments.
     */

    // println() prints the message and then moves to a new line.
    println("Hello World!")

    // print() writes the message without adding a newline.
    print("We Love Kotlin")

    // Kotlin is designed to be interoperable with Java. The snippet below
    // is roughly what the compiler generates for this file:
    /**
     * class HelloWorldKt {
     *     public static void main(String[] args) {
     *         System.out.println("Hello, World!");
     *     }
     * }
     */
}
