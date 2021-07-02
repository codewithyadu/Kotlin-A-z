package datastructure.arrays

fun main() {
    val intArray = arrayOf(20, 25, 45, 89, 89, 90)
    //println(checkIfArrayIsSortedOrNot(intArray))
    println(checkIfArrayIsSortedOrNotUsingRecursive(intArray, intArray.size))
}

/**
 * Iterative approach
 */
fun checkIfArrayIsSortedOrNot(intArray: Array<Int>): Boolean {
    //If one or empty array is sorted
    if (intArray.isEmpty() || intArray.size == 1) {
        return true
    }
    //If element at current index is less than
    //element at index + 1, return true else
    //return false
    for (i in 0 until intArray.size - 1) {
        if (intArray[i] <= intArray[i + 1]) {
            // do nothing
        } else {
            return false
        }
    }
    return true
}

/**
 * Recursive approach
 */
fun checkIfArrayIsSortedOrNotUsingRecursive(intArray: Array<Int>, size: Int): Boolean {
    //If one or empty array is sorted
    if (intArray.isEmpty() || size == 1){
        return true
    }

    //if element at size -2 is greater than size -1
    //then array is not sorted
    if (intArray[size - 2] > intArray[size - 1]) {
        return false
    }

    //recursive call with size - 1
    //eventually size will be 1 when array is sorted and
    //first condition will pass
    //else from second condition false will be returned
    return checkIfArrayIsSortedOrNotUsingRecursive(intArray, size - 1)
}
