package datastructure.arrays

fun main() {
    val intArray = arrayOf(5, 2, 10, 1, 4, 8, 1)
    //firstApproach(intArray)
    secondApproach(intArray)
}

/**
 * By Using two loops
 *
 * Time Complexity : O(n^2)
 * Auxiliary Space : O(1)
 */
fun firstApproach(intArray: Array<Int>) {
    var maxDiff = 0
    var minInSubArray = 0
    var maxInSubArray = 0
    for (i in intArray.indices) {
        for (j in i+1 until intArray.size) {
            if (intArray[i] < intArray[j]) {
                if (intArray[j] - intArray[i] > maxDiff) {
                    maxDiff = intArray[j] - intArray[i]
                    minInSubArray = intArray[i]
                    maxInSubArray = intArray[j]
                }
            } else {
                break
            }
        }
    }

    println("MinElement : $minInSubArray")
    println("MaxElement : $maxInSubArray")
    println("Diff : $maxDiff")
}

/**
 * By using min element concept
 *
 * Time Complexity : O(n)
 * Auxiliary Space : O(1)
 */
fun secondApproach(intArray: Array<Int>) {
    var minElement = intArray[0]
    var maxDiff = 0

    for (i in 1 until intArray.size) {
        if (intArray[i] - minElement > maxDiff)
            maxDiff = intArray[i] - minElement

        if (intArray[i] < minElement)
            minElement = intArray[i]
    }

    println(maxDiff)
}