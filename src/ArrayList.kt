fun main() {

    /*

    ArrayList class is used to create a dynamic array.
    Which means the size of ArrayList class can be increased or decreased according to requirement.
    ArrayList class provides both read and write functionalities.

    ArrayList class follows the sequence of insertion order.
    ArrayList class is non synchronized and it may contains duplicate elements.
    The elements of ArrayList class are accessed randomly as it works on index basis.

     */

    val arrayList = ArrayList<String>() // Creating an empty arraylist
    arrayList.add("Kotlin")
    arrayList.add("Java")
    arrayList.add("Swift")
    arrayList.add("Objective-C")

    // print ArrayList elements
    for (language in arrayList) {
        println("Mobile Programming Language : $language")
    }


    // Let's create an ArrayList class with initialize its initial capacity.
    // The capacity of ArrayList class is not fixed and it can be change later in program according to requirement.
    val ageList = ArrayList<Int>(3)
    ageList.add(12) // Adding object in ageList
    ageList.add(21)
    ageList.add(33)

    for (age in ageList) {

        println("Age : " + age)
    }


    // arrayList size
    println("size of ageList : ${ageList.size}")


    // The get() function of ArrayList class is used to retrieve the element present at given specified index.
    println("ageList.get(1) : ${ageList.get(1)}")


    // The set() function of ArrayList class is used to set the given element at specified index and replace
    // if any element present at specified index.
    ageList.set(0, 45)


    // The indexOf() function of ArrayList class is used to retrieve the index value of first occurrence of element or
    // return -1 if the specified element in not present in the list.
    println(ageList.indexOf(45))


    // new element add
    ageList.add(45)

    // The lastIndexOf() function of ArrayList class is used to retrieve the index value of last occurrence of
    // element or return -1 if the specified element in not present in the list.
    println(ageList.lastIndexOf(45))


    // The remove () function of ArrayList class is used to remove the first occurrence of element if it is
    // present in the list.
    ageList.remove(12)


    // The removeAt() function of ArrayList class is used to remove the element of specified index from the list.
    ageList.removeAt(2)


    // The clear() function of ArrayList class is used to remove (clear) all the elements of list.
    ageList.clear()
}