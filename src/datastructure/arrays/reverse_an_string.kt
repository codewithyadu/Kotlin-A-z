package datastructure.arrays

fun main() {
    reverseAString("Hello")
}

fun reverseAString(string: String) {
    val stringArray = string.toCharArray()
    var start = 0
    var end = stringArray.size - 1
    while (start < end) {
        val temp = stringArray[start]
        stringArray[start] = stringArray[end]
        stringArray[end] = temp
        start++
        end--
    }
    println(stringArray)
}