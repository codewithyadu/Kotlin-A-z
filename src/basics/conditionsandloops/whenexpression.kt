package basics.conditionsandloops

/**
 * Note :-
 * when can also be used to check if a obj is of a given type.
 * After type check is successful, the object is automatically
 * converted to the given type without the need of external cast.
 */

fun main() {
    //simpleWhen(10)
    //whenAsAnExpression(1)
    //whenUsingRange(8)
    whenReplacementOfIfElse(33)
}

/**
 * 1.when defines a conditional expression with multiple branches.
 * 2.It is similar to the switch statement in C-like languages
 * 3.when matches its argument against all branches sequentially
 * until some branch condition is satisfied.
 */
fun simpleWhen(x: Int) {
    when(x) {
        1 -> {
            println("x == 1")
        }
        2 -> {
            println("x == 2")
        }
        else -> {
            println("No match found")
        }
    }
}

/**
 * When as ex expression should always have else block
 * Or it should be exhaustive
 */
fun whenAsAnExpression(x: Int) {
    val value = when(x) {
        1 -> {
            "x == 1"
        }
        2 -> {
            "x == 2"
        }
        else -> {
            "x == No match found"
        }
    }
    println(value)
}

fun whenUsingRange(x: Int) {
    when(x) {
        in 1..10 -> {
            println("Value inside the range is : $x")
        }
        else -> {
            println("Not found int the range")
        }
    }
}

fun whenReplacementOfIfElse(x: Int) {
    when {
        x % 2 == 0 -> {
            println("$x is even")
        }
        else -> {
            println("$x is odd")
        }
    }
}