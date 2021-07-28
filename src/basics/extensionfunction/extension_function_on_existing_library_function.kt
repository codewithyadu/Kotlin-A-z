package basics.extensionfunction

/**
 * Kotlin not only allows the user-defined classes to be extended but
 * also the library classes can be extended. The extension function can
 * be added to library classes and used in a similar way as for user-defined classes.
 */
fun String.isLengthGreaterThanFive() {
    if (this.length > 5) {
        println("Length of name is greater than five")
    } else {
        println("Length of name is not greater than five")
    }
}

fun main() {
    "Raj".isLengthGreaterThanFive()
}