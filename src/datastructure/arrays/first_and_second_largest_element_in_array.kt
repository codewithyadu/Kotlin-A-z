package datastructure.arrays

fun main() {
    val intArray = arrayOf(10, 324, 45, 90, 9808)
    firstAndSecondMaxInArray(intArray)
}

fun firstAndSecondMaxInArray(intArray: Array<Int>) {
    var firstMax = intArray[0]
    var secondMax = -1

    for (i in 1 until intArray.size) {
        firstMax = if (intArray[i] > firstMax) {
            secondMax = firstMax
            intArray[i]
        } else {
            secondMax = secondMax
            firstMax
        }
    }
    println(firstMax)
    println(secondMax)
}