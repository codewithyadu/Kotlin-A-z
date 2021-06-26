package basics.returnandjumps

fun main() {
    //foo()
    //fooOne()
    //fooTwo()
    //fooThree()
}

/**
 * With function literals, local functions and object expression,
 * functions can be nested in Kotlin. Qualified return s allow us
 * to return from an outer function. The most important use case
 * is returning from a lambda expression
 */
fun foo() {
    listOf(1,2,3,4,5).forEach {
        if (it == 3) return
        println(it)
    }
    println("this point is unreachable")
}

/**
 * The return -expression returns from the nearest enclosing function - foo.
 * Note that such non-local returns are supported only for lambda expressions passed to inline functions.
 * To return from a lambda expression, label it and qualify the return:
 */
fun fooOne() {
    listOf(1,2,3,4,5).forEach lit@{
        if (it == 3) return@lit
        println(it)
    }
    println("done with explicit label")
}

/**
 *  Oftentimes it is more convenient to use implicit labels:
 *  such a label has the same name as the function to which the lambda is passed.
 */
fun fooTwo() {
    listOf(1,2,3,4,5).forEach {
        if (it == 3) return@forEach
        println(it)
    }
    println("done with explicit label")
}

/**
 * Alternatively, you can replace the lambda expression with an anonymous function.
 * A return statement in an anonymous function will return from the anonymous function itself.
 */
fun fooThree() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // local return to the caller of the anonymous function - the forEach loop
        println(value)
    })
    print("done with anonymous function")
}