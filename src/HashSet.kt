fun main() {

    /*
        HashSet is a generic unordered collection of elements and it does not contain duplicate elements.

        It implements the set interface. hashSetOf() is a function which returns a mutable hashSet,
        which can be both read and written.

        The HashSet class store all the elements using hashing mechanism.
     */


    // declaring a hashSet of chars
    val chars = hashSetOf('p', 'a', 'z', 'w')

    // println set contains
    println(chars)

    // You can add elements in a hashset using add() and addAll() functions.
    chars.add('c')


    val newChars = setOf('b', 'o')

    //making an extra set to add it in chars
    chars.addAll(newChars)

    println(chars)

    /*
        HashSet there is a hash value calculated for each object and this hash value determines the array index of the
        particular object in the container. So the order of inserted elements are naturally not preserved.
        This allows for accessing desired elements with O(1) complexity but it costs a lot of memory

        For more : https://en.wikipedia.org/wiki/Hash_table
     */

    // removing a from the set
    chars.remove('a')
}