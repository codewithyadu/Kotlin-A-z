package datastructure.arrays

fun main() {
    val intArray = arrayOf(16, 17, 4, 3, 5, 2)
    //leadersInArrayFirstMethod(intArray)
    leadersInArraySecondMethod(intArray)
}

/**
 * Method 1 : Simple
 * Using two loops compare first element with rest elements
 * if bigger than print else break and repeat same as above.
 */
fun leadersInArrayFirstMethod(intArray: Array<Int>) {
    for (i in intArray.indices) {
        var j = i + 1
        while (j < intArray.size) {
            if (intArray[i] < intArray[j]) {
                break
            }
            j++
        }
        if (j == intArray.size)
            println(intArray[i])
    }
}

/**
 * Method 2 : Best method
 */
fun leadersInArraySecondMethod(intArray: Array<Int>) {
    var maxFromRight = intArray[intArray.size - 1]
    println(maxFromRight)
    for (i in intArray.size - 2 downTo 0) {
        if (intArray[i] > maxFromRight) {
            maxFromRight = intArray[i]
            println(maxFromRight)
        }
    }
}


