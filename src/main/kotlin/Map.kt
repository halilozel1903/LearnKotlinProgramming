fun main() {
    /**
     * A map stores key-value pairs. Each key appears at most once.
     *
     * - mapOf() creates a read-only Map.
     * - mutableMapOf() creates a MutableMap you can change after creation.
     *
     * Keys and values can be any type. Linked hash map preserves insertion order
     * when you use mapOf() or mutableMapOf() (the default implementations).
     */

    val capitals = mapOf(
        "Turkey" to "Ankara",
        "Germany" to "Berlin",
        "Japan" to "Tokyo",
    )

    println("Turkey -> ${capitals["Turkey"]}")

    // get() with a default avoids null when the key is missing.
    println("France -> ${capitals.getOrDefault("France", "unknown")}")

    for ((country, city) in capitals) {
        println("$country: $city")
    }

    println("Keys: ${capitals.keys}")
    println("Values: ${capitals.values}")

    val scores = mutableMapOf<String, Int>()
    scores["Alice"] = 95
    scores["Bob"] = 88
    scores.put("Carol", 91)

    scores["Bob"] = 90
    println("Bob's score: ${scores["Bob"]}")

    if ("Dave" !in scores) {
        scores["Dave"] = 76
    }

    scores.remove("Dave")

    // entries exposes each key-value pair for read-only iteration.
    scores.entries.forEach { entry ->
        println("${entry.key} scored ${entry.value}")
    }

    // buildMap { } builds a read-only map in several steps (Kotlin 1.6+).
    val config = buildMap {
        put("language", "Kotlin")
        put("version", "2.x")
    }
    println(config)
}
