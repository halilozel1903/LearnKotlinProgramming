fun main() {

    /**
    Set interface is a generic unordered collection of elements and it does not contain duplicate elements.
    Kotlin supports two types of sets mutable and immutable.

    setOf() :  Immutable means it supports only read-only functionalities.
    mutableSetOf() : Mutable means it supports read and write both functionality.

    Syntax: fun <T> setOf( vararg elements: T): Set<T>

    - This function returns a new read only set of given elements.
    - The elements are iterated over, according as they are stored .
     */

    val mySet = setOf("Kotlin", "Java", "Swift", "Objective-C", "Flutter", "React Native")

    // First solution
    mySet.forEach { println(it) }


    // Second solution

    for (set in mySet) {

        println("Second solution :  $set")
    }

    // get the first element : first()
    println("The first element of the set is : ${mySet.first()}")

    // get the last element : last()
    println("The last element of the set is : ${mySet.last()}")


    //  set of int type
    val numberSet = setOf(1, 3, 5, 7, 10, 8, 2)

    // count method
    println("The number of element in the set is : ${numberSet.count()}")

    // max method
    println("The max of element in the set is : ${numberSet.max()}")

    // min method
    println("The min of element in the set is : ${numberSet.min()}")

    // sum method
    println("The sum of the element in the set is : ${numberSet.sum()}")

    // average method
    println("The average of the element in the set is : ${numberSet.average()}")

    /**
    Using index functions indexOf(), lastIndexOf() You can get the index of the specified element.

    And You can also find the elements at some specific index using elementAt() function.
     */

    val cities = setOf("Istanbul", "Paris", "New York", "London", "Berlin")

    println("The element at index 3 is : ${cities.elementAt(3)}") // London

    println("The index of element is : ${cities.indexOf("Istanbul")}") // 0

    println("The last index of element is : ${cities.lastIndexOf("London")}") // 3
}