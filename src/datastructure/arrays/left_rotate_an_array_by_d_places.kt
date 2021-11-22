package datastructure.arrays

// TODO :- Note  One more method to cover later by using Juggling Algorithm in geeksforgeeks
fun main() {
    val intArray = arrayOf(1, 2, 3, 4, 5, 6, 7)
   // usingTempArray(intArray, 2)
    usingExtraSpace(intArray, 2)
}

/**
 * By rotating array one by one
 * C : O(n*d)
 * S : O(1)
 */
fun usingTempArray(intArray: Array<Int>, d: Int) {
    for (i in 0 until d) {
        leftRotateAnArrayOneByOne(intArray)
    }
    println(intArray.contentToString())
}

fun leftRotateAnArrayOneByOne(intArray: Array<Int>) {
    val temp = intArray[0]
    for (i in 0 until intArray.size - 1) {
        intArray[i] = intArray[i+1]
    }
    intArray[intArray.size - 1] = temp
}

/**
 * By rotating array one by one
 * C : O(n)
 * S : O(1)
 */
fun usingExtraSpace(intArray: Array<Int>, d: Int) {
    val tempList  = mutableListOf<Int>()
    for (i in 0 until d)
        tempList.add(intArray[i])

    for (i in d until intArray.size)
        intArray[i - d] = intArray[i]

    for (i in (intArray.size - d) until intArray.size)
        intArray[i] = tempList[i - (intArray.size - d)]
    println(intArray.contentToString())
}
