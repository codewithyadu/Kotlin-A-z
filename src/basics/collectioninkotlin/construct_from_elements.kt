package basics.collectioninkotlin

fun main() {
    //println(initializerFunctionForList())
    //copyingCollection()
    //filterCreatingNewList()
    //mapCreatingNewList()
    associateCreatingNewList()
}

/**
 * List(3) :- size is provided here
 * and in lambda initializer logic is provided
 * and hence create a list of size 3 with
 * the values as per logic
 */
fun initializerFunctionForList() {
    val valueList = List(3) {
        if (it == 0) {
            it
        } else {
            it * 3
        }
    }
    println(valueList)
}

//Copy
/**
 * To create a collection with the same elements as an existing collection,
 * you can use copying operations. Collection copying operations from the
 * standard library create shallow copy collections with references to the
 * same elements. Thus, a change made to a collection element reflects in all its copies.
 *
 * Collection copying functions, such as toList(), toMutableList(), toSet() and others,
 * create a snapshot of a collection at a specific moment. Their result is a new collection
 * of the same elements. If you add or remove elements from the original collection, this
 * won't affect the copies. Copies may be changed independently of the source as well.
 *
 * This can also be used to change one collection type to other
 */
fun copyingCollection() {
    val list = mutableListOf(1, 2 , 3, 4)
    val newList = list.toMutableList()

    //1st operation
    list.add(20)
    println(list)
    println(newList)

    //2nd operation
    newList.remove(2)
    println(list)
    println(newList)

    //list changed to set,
    //so these can be used to change collection type also
    val set = list.toMutableSet()
    set.add(10)
    set.add(4)
    println(set)
}

fun filterCreatingNewList() {
    val list = listOf(1, 2 , 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = list.filter {
        it % 2 == 0
    }
    println(evenList)
}

fun mapCreatingNewList() {
    val list = listOf(1, 2 , 3, 4, 5, 6, 7, 8, 9, 10)
    val newList = list.map {
        it * 10
    }
    println(newList)
}

fun associateCreatingNewList() {
    val numbers = listOf("one", "two", "three", "four")
    val map = numbers.associateWith { it.length }
    println(map)
}