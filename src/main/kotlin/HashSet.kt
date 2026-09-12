fun main() {
    /**
     * hashSetOf() creates a mutable HashSet: unique elements, no guaranteed order.
     * Each value is stored by its hash code, which makes membership checks fast.
     *
     * mutableSetOf() usually gives you a LinkedHashSet, which keeps insertion order.
     * Choose hashSetOf() when you care about uniqueness and lookup speed, not order.
     */

    val chars = hashSetOf('p', 'a', 'z', 'w')
    println(chars)

    chars.add('c')

    val newChars = setOf('b', 'o')
    chars.addAll(newChars)
    println(chars)

    /**
     * A hash table computes an index from each object's hash code.
     * That is why insertion order is not preserved, and why lookups are O(1)
     * on average. The trade-off is extra memory for the table.
     *
     * More: https://en.wikipedia.org/wiki/Hash_table
     */
    chars.remove('a')
    println(chars)

    println("Contains 'z': ${'z' in chars}")
}
