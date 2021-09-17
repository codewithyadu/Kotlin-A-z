package basics.collectioninkotlin

/**
 * 1.For traversing collection elements, the Kotlin standard library supports the commonly
 * used mechanism of iterators – objects that provide access to the elements sequentially
 * without exposing the underlying structure of the collection. Iterators are useful when
 * you need to process all the elements of a collection one-by-one, for example, print values
 * or make similar updates to them.
 *
 * 2.Once you obtain an iterator, it points to the first element of a collection; calling the next()
 * function returns this element and moves the iterator position to the following element if it exists.
 *
 * 3.Once the iterator passes through the last element, it can no longer be used for retrieving elements;
 * neither can it be reset to any previous position. To iterate through the collection again, create a new iterator.
 */
fun main() {
    //iteratorsExample()
    //usingForLoop()
    //usingForEach()
    //listIterators()
    mutableIterators()
}

fun iteratorsExample() {
    val letters = listOf("a", "b", "c", "d", "e")
    letters.iterator().apply {
        while (hasNext()) {
            println(next())
        }
    }
}

/**
 * For lists, there is a special iterator implementation: ListIterator.
 * It supports iterating lists in both directions: forwards and backwards.
 * Backward iteration is implemented by the functions hasPrevious() and previous().
 * Additionally, the ListIterator provides information about the
 * element indices with the functions nextIndex() and previousIndex().
 */
fun listIterators() {
    //Iterating forward
    val letters = listOf("a", "b", "c", "d", "e")
    val listIterator = letters.listIterator()

    println("Moving forward")
    while (listIterator.hasNext())
        println(listIterator.next())


    //Iterating backward
    println("Moving backward")
    while (listIterator.hasPrevious()) {
        println(listIterator.previous())
        println(listIterator.previousIndex())
    }
}

/**
 * 1.For iterating mutable collections, there is MutableIterator that extends Iterator with the element
 * removal function remove(). So, you can remove elements from a collection while iterating it.
 *
 * 2.In addition to removing elements, the MutableListIterator can also insert and
 * replace elements while iterating the list.
 */
fun mutableIterators() {
    // iterators with remove
    val letters = mutableListOf("a", "b", "c", "d", "e")
    val lettersIterator = letters.iterator()
    lettersIterator.next()
    lettersIterator.remove()
    println(letters)

    // mutable iterators with add to add new element
    // set to replace existing element with new element
    val lettersListIterator = letters.listIterator()
    // adding element
    lettersListIterator.next()
    lettersListIterator.add("w")
    println(letters)
    // replacing element
    lettersListIterator.next()
    lettersListIterator.set("k")
    println(letters)
}

fun usingForLoop() {
    val letters = listOf("a", "b", "c", "d", "e")
    for (item in letters)
        println(item)
}

fun usingForEach() {
    val letters = listOf("a", "b", "c", "d", "e")
    letters.forEach {
        println(it)
    }
}
