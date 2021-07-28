package basics.extensionfunction

class NewYork

/**
 * Extension functions can also be defined with the class type that is nullable.
 * In this case, when the check for null is added inside the extension function
 * and the appropriate value is returned.
 */
fun NewYork?.cityType() {
    if (this == null) {
        println("Not a Beautiful city")
    } else {
        println("Beautiful city")
    }
}

fun main() {
    null.cityType()
    NewYork().cityType()
}

