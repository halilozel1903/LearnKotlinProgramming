fun main() {
    /**
     * Kotlin lists come in two flavors:
     * - listOf() creates a read-only List.
     * - mutableListOf() creates a MutableList whose size can grow or shrink.
     *
     * ArrayList is the Java class underneath most mutable lists. You can still
     * construct it directly, but mutableListOf() is the usual Kotlin style.
     * Lists keep insertion order and may contain duplicate elements.
     */

    val languages = mutableListOf("Kotlin", "Java", "Swift", "Objective-C")

    for (language in languages) {
        println("Mobile programming language: $language")
    }

    // You can still create a Java ArrayList when you want that type explicitly.
    val ageList = ArrayList<Int>(3)
    ageList.add(12)
    ageList.add(21)
    ageList.add(33)

    for (age in ageList) {
        println("Age: $age")
    }

    println("size of ageList: ${ageList.size}")

    // Index access is preferred over get() / set().
    println("ageList[1]: ${ageList[1]}")

    ageList[0] = 45

    // indexOf() returns the first match, or -1 if the value is missing.
    println(ageList.indexOf(45))

    ageList.add(45)

    // lastIndexOf() returns the last match, or -1 if the value is missing.
    println(ageList.lastIndexOf(45))

    // remove() deletes the first matching value.
    ageList.remove(12)

    // removeAt() deletes the element at the given index.
    ageList.removeAt(2)

    // clear() removes every element.
    ageList.clear()

    // buildList { } is a concise way to create a read-only list with several steps.
    val prepared = buildList {
        add("Kotlin")
        add("Gradle")
    }
    println(prepared)
}
