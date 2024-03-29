import java.util.*

fun main() {

    val x = "2"
    val y = "3"

    // String + String = String
    val z = x + y

    // When string type data is addition, the data is written side by side.
    println("$x + $y = $z") // 2 + 3 = 23

    // String Type A Value
    val languageName = "Kotlin"

    //In Kotlin, a String is interpreted as an expression Array
    for (character in languageName) {
        println(character) // K - o - t - l - i - n
    }

    // String expression's length value : 6
    println("Language Name's Character Length : ${languageName.length}")


    val nameSurname = "  Halil Ozel   "

    println(nameSurname) //   Halil Ozel

    // trim()  : This method deletes spaces.
    println(nameSurname.trim()) // Halil Ozel


    // toUpperCase() : All characters are Big.
    val message = "WE love KoTlIn"

    println(message.uppercase(Locale.getDefault())) // WE LOVE KOTLIN

    // toLowerCase()  : All characters are Small.
    println(message.lowercase(Locale.getDefault())) // we love kotlin


    // String Value
    val tvSeries = "How I Met Your Mother"

    // split() : This method divides
    println(tvSeries.split(" ")) // [How, I, Met, Your, Mother]

    // When it finds the letter r, it divides it up.
    println(tvSeries.split("r")) // [How I Met You,  Mother, ]

    // When it finds the letter o, it divides it up. New Array is ready
    val newSeries = tvSeries.split("o")

    println("newSeries : $newSeries") // newSeries : [H, w I Met Y, ur M, ther]

    println("newSeries Size : ${newSeries.size}") // newSeries Size : 4

    println("newSeries[2] = ${newSeries[2]}") // newSeries[2] = ur M
}