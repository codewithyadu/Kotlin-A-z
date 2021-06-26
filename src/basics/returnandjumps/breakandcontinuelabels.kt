package basics.returnandjumps


fun main() {
    //withoutLabelExample()
    //labelExample()
    aboveExampleWithoutLabel()
}

/**
 * Any expression in Kotlin may be marked with a label.
 * Labels have the form of an identifier followed by the @ sign,
 * for example: abc@, fooBar@. To label an expression,
 * just add a label in front of it.
 */
/*
loop@ for (i in 1..100) {
    // ...
}
*/

/**
 * Look at both the example,
 * By looking at the output, we understand that label becomes
 * useful when we want to exist from the outer loop based on the inner loop
 * condition we can use label.
 * Therefor, on some condition of inner loop need to exist from outer loop
 * use labels with return or continue.
 *
 * For more reference, refer this link :-
 * https://matthew-b-groves.medium.com/matts-tidbits-15-using-kotlin-labels-for-good-92766da296fa
 */
fun withoutLabelExample() {
    for (i in 1..20) {
        for (j in 1..20) {
            if (j == 10) break
            println(j)
        }
    }
}

fun labelExample() {
    loop@ for (i in 1..20) {
        for (j in 1..20) {
            if (j == 10) break@loop
            println(j)
        }
    }
}

/**
 * By looking at this code, we can see
 * how label helps us to remove boilerplate code
 * So, prefer label where we need to break outer loops
 * based on inner loop condition
 */
fun aboveExampleWithoutLabel() {
    var x = 0
    for (i in 1..20) {
        for (j in 1..20) {
            x = j
            if (j == 10) break
            println(j)
        }
        if (x == 10) break
    }
}
