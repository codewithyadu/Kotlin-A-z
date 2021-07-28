package datastructure.arrays

fun main() {
    val intArray = arrayOf(10, 10, 20, 90, 100)
    removeDuplicates(intArray)
    //removeDuplicatesUsingDistinct(intArray)
}

/**
 * Simple method
 */
fun removeDuplicates(intArray: Array<Int>) {
    var currentIndex = 0

    for (i in 0 until intArray.size - 1) {
        if (intArray[i] != intArray[i+1]) {
            intArray[currentIndex] = intArray[i]
            currentIndex++
        }
    }
    intArray[currentIndex] = intArray.last()
    println(intArray.contentToString())
}

/**
 * distinct() : it removes the duplicates and returns a list
 * toTypedArray : converts the list back to Array<Int>
 */
fun removeDuplicatesUsingDistinct(intArray: Array<Int>) {
    val newArray: Array<Int> = intArray.distinct().toTypedArray()
    println(newArray.contentToString())
}