package basics.objectinkotlin

/**
 * The object keyword does 2 things at the same time
 * Defines a class
 * Creates an instance of that class
 */
object Singleton {
    private var count = 0

    fun count(): Int{
        count++
        return count
    }
}

fun main() {
    val x = Singleton.count()
    val y = Singleton.count()
    println("X: $x")
    println("X: $y")
}