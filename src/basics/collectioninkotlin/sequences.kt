package basics.collectioninkotlin

/**
 * Note : In some cases sequences are better than collection in terms of performance
 * To learn more about is visit the medium blog :
 * 1.https://medium.com/androiddevelopers/collections-and-sequences-in-kotlin-55db18283aca
 * 2.https://blog.kotlin-academy.com/effective-kotlin-use-sequence-for-bigger-collections-with-more-than-one-processing-step-649a15bb4bf
 */
fun main() {
    //creatingSequenceUsingGenerate()
    creatingSequenceUsingChunk()
}

fun creatingSequence() {
    val numberSequence = sequenceOf("one","two","three","four")
}

fun creatingSequenceFromIterable() {
    val numberList = listOf("one","two","three","four")
    val numberSequence = numberList.asSequence()
}

/**
 * One more way to create a sequence is by building it with a function that calculates its elements.
 * To build a sequence based on a function, call generateSequence() with this function as an argument.
 * Optionally, you can specify the first element as an explicit value or a result of a function call.
 * The sequence generation stops when the provided function returns null.
 */
fun creatingSequenceUsingGenerate() {
    val evenNumberLessThanTen = generateSequence(0) { if (it < 8) it + 2 else null }
    evenNumberLessThanTen.forEach {
        println(it)
    }
}

/**
 * Finally, there is a function that lets you produce sequence elements one by one or by chunks of arbitrary sizes –
 * the sequence() function. This function takes a lambda expression containing calls of yield() and yieldAll() functions.
 * They return an element to the sequence consumer and suspend the execution of sequence() until the next element is
 * requested by the consumer. yield() takes a single element as an argument; yieldAll() can take an Iterable object,
 * an Iterator, or another Sequence. A Sequence argument of yieldAll() can be infinite.
 * However, such a call must be the last: all subsequent calls will never be executed.
 */
fun creatingSequenceUsingChunk() {
    val evenNumber = sequence {
        yield(0)
        yieldAll(listOf(2,4))
        yieldAll(generateSequence(6) { it + 2 })
    }

    //take :- returns a sequence containing first n elements.
    println(evenNumber.take(10).toList())
}

