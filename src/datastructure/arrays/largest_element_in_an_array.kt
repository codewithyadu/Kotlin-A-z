package datastructure.arrays

/**
 * LARGEST ELEMENT IN AN ARRAY
 */

fun main() {
    val intArray = arrayOf(10, 324, 45, 90, 9808)
    println(maxElementInArray(intArray))
    println(maxElementInArrayUsingArrayMethods(intArray))
}

/**
 * Main Approach
 */
fun maxElementInArray(intArray: Array<Int>): Int {
    var maxElement = intArray[0]
    for (i in 1 until intArray.size) {
        if (intArray[i] > maxElement) {
            maxElement = intArray[i]
        }
    }
    return maxElement
}

/**
 * Using kotlin provided method
 */
fun maxElementInArrayUsingArrayMethods(intArray: Array<Int>): Int {
    return intArray.max() ?: -1
}