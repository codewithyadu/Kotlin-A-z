package datastructure.arrays

fun main() {
    val intArray = arrayOf(1, 1, 2, 2, 2, 2, 3)
   // calculateFrequencies(intArray, 2)
    calculateFrequenciesUsingEachCount(intArray, 2)
}

fun calculateFrequencies(intArray: Array<Int>, number: Int) {
    var count = 0
    intArray.forEach {
        if (it == 2)
            count++
    }
    println(count)
}

/**
 * Better Approach
 */
fun calculateFrequenciesUsingEachCount(intArray: Array<Int>, number: Int) {
    // create a map with frequency
    val mapWithFrequency = intArray.toList().groupingBy {
        it
    }.eachCount()
    // give the frequency of the number
    val frequency = mapWithFrequency[number]
    println(frequency)
}