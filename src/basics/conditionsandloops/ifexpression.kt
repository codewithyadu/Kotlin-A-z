package basics.conditionsandloops

fun main() {
    //simpleIfExample(10, 20)
    ifAsExpression(10, 20)
}

fun simpleIfExample(a: Int, b: Int) {
    if (a > b) {
        println(a)
    } else {
        println(b)
    }
}

/**
 * 1.In Kotlin, if is an expression: it returns a value.
 * 2.Branches of if branches can be blocks. In this case,
 * the last expression is the value of a block:
 * 3.If you're using if as an expression, for example,
 * for returning its value or assigning it to a variable, the else branch is mandatory.
 */
fun ifAsExpression(a: Int, b: Int) {
    val max = if (a > b) {
        a
    } else {
        b
    }

    println(max)
}