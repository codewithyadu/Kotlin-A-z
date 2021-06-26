package basics.classandobject.constructor.primary

/**
 * A class in Kotlin can have a primary constructor and one or more secondary constructors.
 * The primary constructor is part of the class header:
 * it goes after the class name (and optional type parameters).
 */

class Person constructor(firstName: String)

/**
If the primary constructor does not have any annotations or visibility modifiers,
the constructor keyword can be omitted:
 */

class NewPerson(firstName: String)

/**
 * The primary constructor cannot contain any code.
 * Initialization code can be placed in initializer blocks, which are prefixed with the init keyword.
 * During an instance initialization, the initializer blocks are executed in the same order as they
 * appear in the class body, interleaved with the property initializers:
 */
class InitOrderDemo(name: String) {
    init {
        println("First initializer block that prints $name")
    }

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

/**
 * Kotlin has a concise syntax for declaring properties and initializing them from the primary constructor:
 */
class PersonTwo(val firstName: String, val secondName: String, val age: String)

/**
 * Such declarations can also include default values of the class properties:
 */
class PersonThree(val firstName: String, val lastName: String, var isEmployed: Boolean = true)

/**
 * You can use a trailing comma when you declare class properties:
 * Much the same way as regular properties, the properties declared in the primary constructor
 * can be mutable (var) or read-only (val ).
 */
class PersonFour(
        val firstName: String,
        val lastName: String,
        var age: Int
) { /*...*/ }

/**
 * If the constructor has annotations or visibility modifiers, the constructor keyword is required,
 * and the modifiers go before it:
 */
//class Customer public @Inject constructor(name: String) { /*...*/ }






