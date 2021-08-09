package basics.collectioninkotlin

/**
 * In Kotlin collections are categories into two forms.
 * 1.Immutable Collection
 * 2.Mutable Collection
 *
 * Immutable collection :-
 * It means that it supports only read-only functionalities and can not be modified its elements. Immutable Collections and their corresponding methods are:
 * List – listOf() and listOf<T>()
 * Set – setOf()
 * Map – mapOf()
 */
fun main() {
    //immutableListExample()
    //immutableSetExample()
    immutableMapExample()
}

/**
 * List – It is an ordered collection in which we can access elements or
 * items by using indices – integer numbers that define a position for each element.
 * Elements can be repeated in a list any number of times. We can not perform add or
 * remove operations in the immutable list.
 */
fun immutableListExample() {
    val immutableList = listOf<String>("ABC","XYZ","KLM")
    for (item in immutableList){
        println(item)
    }
}

/**
 * Set – It is a collection of unordered elements also it does not support duplicate elements.
 * It is a collection of unique elements. Generally, the order of set elements does not have a
 * significant effect. We can not perform add or remove operations because it is an immutable Set.
 */
fun immutableSetExample() {
    val immutableSet = setOf<Int>(1, 2, 55, 2, 1)
    for (item in immutableSet) {
        println(item)
    }
}

/**
 * Map – Map keys are unique and hold only one value for each key,
 * it is a set of key-value pairs. Each key maps to exactly one value.
 * The values can be duplicates but keys should be unique. Maps are used to store
 * logical connections between two objects, for example, a student ID and their name.
 * As it is immutable its size is fixed and its methods support read-only access.
 */
fun immutableMapExample() {
    val immutableMap = mapOf<Int, String>(1 to "John", 2 to "Leo", 3 to "Georgia")
    for (item in immutableMap.values) {
        println(item)
    }
}