package basics.interfaceinkotlin

/**
 * The interface definition in Kotlin begins with the interface keyword followed by
 * the name of the interface, followed by the curly braces within which the members
 * of the interface reside. The difference is that the members will have no definition
 * of their own. These definitions will be provided by the conforming types.
 *
 * Just like methods, interfaces can also contain properties.
 * However, since the interface doesn’t have a state that is,
 * they can’t be instantiated, so there are no backing fields to hold their values.
 * Hence, the fields in the interface are either left abstract or are provided an implementation.
 */
interface University {
    val city: String
        get() = "Bangalore"

    val rank: String

    fun batch()
    fun stream()
}

class Student(override val rank: String) : University {
    override fun batch() {
        println("Batch is 2021 - 2025")
    }

    override fun stream() {
        println("Stream is 2021 - 2025")
    }

}

/**
 * Methods in an interface can have default values for its parameters.
 * If the value for a parameter is not provided at the time of function call,
 * then the default value is used. Also, the methods can have default implementations.
 * These are used in the case where the method is not overridden.
 */
interface Car {
    fun start(topSpeed: String = "210 km/h")
    fun stop() {
        println("Car stopped")
    }
}

class Sedan : Car {
    override fun start(topSpeed: String) {
        println("Top Speed is :$topSpeed")
    }

    fun stopCar() {
        println("Please stop")
        super.stop()
    }
}

fun main() {
    val sedan = Sedan()
    sedan.start()
    sedan.stop()
}

