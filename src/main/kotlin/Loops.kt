fun main() {
    /**
     * Loops repeat a block of code until a condition is met or a collection is exhausted.
     * Kotlin supports while, do-while, for, and the repeat() helper.
     */

    // while runs the body while the condition is true.
    var count = 3
    while (count > 0) {
        println("while: count = $count")
        count--
    }

    // do-while always runs the body at least once, then checks the condition.
    var attempt = 0
    do {
        println("do-while: attempt = $attempt")
        attempt++
    } while (attempt < 2)

    /**
     * for is the usual way to iterate ranges and collections.
     * A range such as 1..5 includes both end points (1, 2, 3, 4, 5).
     */
    for (day in 1..5) {
        println("Weekday slot: $day")
    }

    // until excludes the end value: 0, 1, 2, 3.
    for (i in 0 until 4) {
        print("$i ")
    }
    println()

    // step skips values in a range.
    for (even in 2..10 step 2) {
        print("$even ")
    }
    println()

    val languages = listOf("Kotlin", "Java", "Swift")
    for (language in languages) {
        println("Language: $language")
    }

    // withIndex() gives you the position and the element together.
    for ((index, language) in languages.withIndex()) {
        println("languages[$index] = $language")
    }

    // break leaves the nearest enclosing loop; continue skips to the next iteration.
    for (n in 1..10) {
        if (n == 3) continue
        if (n == 8) break
        print("$n ")
    }
    println()

    // repeat(n) { ... } runs the lambda n times; the parameter is the zero-based index.
    repeat(3) { index ->
        println("repeat index: $index")
    }
}
