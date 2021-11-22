package basics.collectioninkotlin

fun main() {
    //rangesUsingIf()
    //rangesUsingForLoop()
    //downToUsingForLoop()
    //rangesUsingForLoopUsingSteps()
    //downToUsingForLoopUsingSteps()
    //rangesByExcludingLastElement()
    iteratingInReverseUsingReverse()
}

fun rangesUsingIf() {
    val i = 10
    if (i in 10..20) // 10 and 20 is included
        println(i)
}

fun rangesUsingForLoop() {
    for (i in 1..4)
        println(i)
}

/**
 * To iterate numbers in reverse order, use the downTo function instead of ..
 */
fun downToUsingForLoop() {
    for (i in 4 downTo 1)
        println(i)
}

/**
 * It is also possible to iterate over numbers with an arbitrary step (not necessarily 1).
 * This is done via the step function.
 */
fun rangesUsingForLoopUsingSteps() {
    for (i in 1..8 step 2)
        println(i)
}

/**
 * It is also possible to iterate over numbers with an arbitrary step (not necessarily 1).
 * This is done via the step function.
 */
fun downToUsingForLoopUsingSteps() {
    for (i in 8 downTo 0 step 2)
        println(i)
}

/**
 * To iterate a number range which does not include its end element, use the until function:
 */
fun rangesByExcludingLastElement() {
    for (i in 1 until 4)
        println(i)
}

fun iteratingInReverseUsingReverse() {
    for (i in (1..4).reversed())
        println(i)
}

