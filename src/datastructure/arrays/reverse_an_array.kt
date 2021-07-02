package datastructure.arrays

fun main() {
    val intArray = arrayOf(4, 5, 1, 2, 10)
    //reverseAnArrayUsingKotlinProvideFunction(intArray)
    //reverseAnArray(intArray)
    reverseAnArrayUsingRecursiveApproach(intArray, 0, intArray.size - 1)
    println(intArray.contentToString())
}

/**
 * Using kotlin provided method
 */
fun reverseAnArrayUsingKotlinProvideFunction(intArray: Array<Int>) {
    intArray.reverse() // reverse in place i.e it reverse the array permanently
    println(intArray.contentToString())
}

/**
 * Efficient approach
 */
fun reverseAnArray(intArray: Array<Int>) {
    var start = 0
    var end = intArray.size - 1
    while (start < end) {
        val temp = intArray[start]
        intArray[start] = intArray[end]
        intArray[end] = temp
        start ++
        end --
    }
    println(intArray.contentToString())
}

/**
 * Recursive approach
 */
fun reverseAnArrayUsingRecursiveApproach(intArray: Array<Int>, start: Int, end: Int): Array<Int>{
    if (start >= end) {
        return intArray
    }
    val temp = intArray[start]
    intArray[start] = intArray[end]
    intArray[end] = temp
    return reverseAnArrayUsingRecursiveApproach(intArray, start + 1, end - 1)
}