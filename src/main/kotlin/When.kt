fun main() {
    /**
     * when is Kotlin's powerful alternative to long if-else chains and switch statements.
     * It can be used as a statement (no result) or as an expression (produces a value).
     */

    val score = 85

    // when as a statement
    when {
        score >= 90 -> println("Grade: A")
        score >= 80 -> println("Grade: B")
        score >= 70 -> println("Grade: C")
        else -> println("Grade: keep practicing")
    }

    // when as an expression — every branch must be covered or use else.
    val gradeLetter = when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        else -> "D"
    }
    println("Letter grade: $gradeLetter")

    val dayOfWeek = 3

    // Matching a single subject with several values per branch.
    val dayName = when (dayOfWeek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4, 5 -> "Thursday or Friday"
        in 6..7 -> "Weekend"
        else -> "Unknown"
    }
    println("Day $dayOfWeek is $dayName")

    val input: Any = 42

    // Branches can test types with is; smart casts apply inside each branch.
    val description = when (input) {
        is String -> "Text with ${input.length} characters"
        is Int -> "Integer: $input"
        is Boolean -> if (input) "true" else "false"
        else -> "Something else"
    }
    println(description)

    // Without a subject, when { } works like if-else-if.
    val temperature = 18
    when {
        temperature < 0 -> println("Freezing")
        temperature in 0..15 -> println("Cool")
        temperature in 16..25 -> println("Comfortable")
        else -> println("Hot")
    }
}
