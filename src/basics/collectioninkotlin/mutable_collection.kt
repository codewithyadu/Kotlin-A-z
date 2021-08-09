package basics.collectioninkotlin

/**
 * It supports both read and write functionalities. Mutable collections and their
 * corresponding methods are:
 *
 * List – mutableListOf(),arrayListOf() and ArrayList
 * Set – mutableSetOf(), hashSetOf()
 * Map – mutableMapOf(), hashMapOf() and HashMap
 */
fun main() {
    //mutableListExample()
    //mutableSetExample()
    mutableMapExample()
}

fun mutableListExample() {
    val mutableList = mutableListOf<String>("ABC","XYZ","KLM")
    for (item in mutableList){
        println(item)
    }

    mutableList.add("HIJ")
    for (item in mutableList){
        println(item)
    }

    mutableList.remove("ABC")
    for (item in mutableList){
        println(item)
    }
}

fun mutableSetExample() {
    val mutableSet = mutableSetOf<Int>(1, 2, 55, 2, 1)
    for (item in mutableSet) {
        println(item)
    }

    mutableSet.add(101)
    for (item in mutableSet) {
        println(item)
    }

    mutableSet.remove(55)
    for (item in mutableSet) {
        println(item)
    }
}


fun mutableMapExample() {
    val mutableMap = mutableMapOf<Int, String>(1 to "John", 2 to "Leo", 3 to "Georgia")
    for (item in mutableMap.values) {
        println(item)
    }

    mutableMap.put(4, "Dani")
    //or
    mutableMap[10] = "Sam"
    for (item in mutableMap.values) {
        println(item)
    }

    mutableMap.remove(1)
    for (item in mutableMap.values) {
        println(item)
    }
}
