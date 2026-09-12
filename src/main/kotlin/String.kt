fun main() {
    val x = "2"
    val y = "3"

    // Adding two strings concatenates them; it does not add numbers.
    val z = x + y
    println("$x + $y = $z") // 2 + 3 = 23

    val languageName = "Kotlin"

    // A String is a sequence of Char values, so you can iterate over it.
    for (character in languageName) {
        println(character)
    }

    println("Language name length: ${languageName.length}")

    val nameSurname = "  Halil Ozel   "
    println(nameSurname)

    // trim() removes leading and trailing whitespace.
    println(nameSurname.trim())

    val message = "WE love KoTlIn"

    // uppercase() and lowercase() replace the older toUpperCase() / toLowerCase() APIs.
    println(message.uppercase()) // WE LOVE KOTLIN
    println(message.lowercase()) // we love kotlin

    val tvSeries = "How I Met Your Mother"

    // split() returns a list of pieces around the given delimiter.
    println(tvSeries.split(" ")) // [How, I, Met, Your, Mother]
    println(tvSeries.split("r")) // [How I Met You,  Mothe, ]

    val newSeries = tvSeries.split("o")
    println("newSeries: $newSeries")
    println("newSeries size: ${newSeries.size}")
    println("newSeries[2] = ${newSeries[2]}")

    // Triple-quoted strings keep line breaks and can use a trimMargin() prefix.
    val multiline = """
        |Kotlin strings support
        |templates and raw text.
    """.trimMargin()
    println(multiline)
}
