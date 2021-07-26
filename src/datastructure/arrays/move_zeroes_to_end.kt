package datastructure.arrays

fun main() {
    val intArray = arrayOf(1, 2, 0, 4, 3, 0, 5, 0)
    println(moveZeroesToTheEndThirdMethod(intArray).contentToString())
}

/**
 * 1st method
 */
fun moveZeroesToTheEnd(intArray: Array<Int>): Array<Int> {
    var count = 0
    val list = mutableListOf<Int>()

    for (element in intArray) {
        if (element != 0) {
            list.add(element)
        } else {
            count++
        }
    }

    for (i in 0 until count) {
        list.add(0)
    }

    return list.toTypedArray()
}

/**
 * 2nd Method:- efficient method
 * Most Preferred
 */
fun moveZeroesToTheEndSecondMethod(intArray: Array<Int>): Array<Int> {
    var startIndex = 0
    var lastIndex = intArray.size - 1

    while (startIndex < lastIndex) {
        when {
            intArray[startIndex] != 0 -> {
                startIndex++
            }
            intArray[lastIndex] == 0 -> {
                lastIndex--
            }
            intArray[startIndex] == 0 && intArray[lastIndex] != 0 -> {
                intArray[startIndex] = intArray[lastIndex]
                intArray[lastIndex] = 0
                startIndex++
                lastIndex--
            }
        }
    }
    return intArray
}

/**
 * 3rd Method :- Efficient method
 */

fun moveZeroesToTheEndThirdMethod(intArray: Array<Int>): Array<Int> {
    var count = 0
    for (i in intArray.indices) {
        if (intArray[i] != 0) {
           intArray[count++] = intArray[i]
        }
    }

    while (count < intArray.size) {
        intArray[count++] = 0
    }
    return intArray
}



