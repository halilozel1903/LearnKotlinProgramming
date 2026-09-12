fun main() {
    /**
     * A Set is a collection of unique elements. Kotlin has two common builders:
     *
     * setOf() — a read-only set.
     * mutableSetOf() — a set you can add to or remove from.
     *
     * setOf() keeps the order in which you listed the elements (LinkedHashSet).
     */

    val mySet = setOf("Kotlin", "Java", "Swift", "Objective-C", "Flutter", "React Native")

    mySet.forEach { println(it) }

    for (item in mySet) {
        println("Second solution: $item")
    }

    println("Contains Kotlin: ${"Kotlin" in mySet}")

    println("The first element of the set is: ${mySet.first()}")
    println("The last element of the set is: ${mySet.last()}")

    val numberSet = setOf(1, 3, 5, 7, 10, 8, 2)

    println("The number of elements in the set is: ${numberSet.count()}")

    // max() and min() throw if the collection is empty.
    // Use maxOrNull() / minOrNull() when the set might be empty.
    println("The max element in the set is: ${numberSet.max()}")
    println("The min element in the set is: ${numberSet.min()}")
    println("The maxOrNull element in the set is: ${numberSet.maxOrNull()}")
    println("The minOrNull element in the set is: ${numberSet.minOrNull()}")

    println("The sum of the elements is: ${numberSet.sum()}")
    println("The average of the elements is: ${numberSet.average()}")

    /**
     * indexOf() and lastIndexOf() return the position of an element.
     * elementAt() returns the element at a given index in iteration order.
     */
    val cities = setOf("Istanbul", "Paris", "New York", "London", "Berlin")

    println("The element at index 3 is: ${cities.elementAt(3)}") // London
    println("The index of Istanbul is: ${cities.indexOf("Istanbul")}") // 0
    println("The last index of London is: ${cities.lastIndexOf("London")}") // 3
}
