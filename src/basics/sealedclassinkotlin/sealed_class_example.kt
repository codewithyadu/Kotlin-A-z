package basics.sealedclassinkotlin

/**
 * Useful medium link :
 * https://medium.com/android-dev-hacks/explore-kotlin-sealed-classes-7f54ddb74f28
 */

/**
 * A sealed class defines a set of subclasses within it.
 * It is used when it is known in advance that a type will
 * conform to one of the subclass types. Sealed classes ensure
 * type-safety by restricting the types to be matched at compile-time
 * rather than at runtime.
 *
 * To define a sealed class, just precede the class modifier with the sealed keyword.
 * The sealed classes also have one another distinct feature, their constructors are
 * private by default.A sealed class is implicitly abstract and hence it cannot be instantiated.
 */
sealed class Driver

sealed class Base {
    class ChildOne(): Base() {
        fun printText() {
            println("Child One")
        }
    }

    class ChildTwo(): Base() {
        fun printText() {
            println("Child Two")
        }
    }

    class ChildThree(): Base() {
        fun printText() {
            println("Child Three")
        }
    }
}

/**
 * All the subclasses of the sealed class must be defined within
 * the same Kotlin file. However, it not necessary to define them
 * within the sealed class, they can be defined in any scope where
 * the sealed class is visible.
 */
class OutChild(): Base() {
    fun printText() {
        println("Child Out")
    }

    //Not allowed
//    class ChildNew(): Base() {
//        fun printText() {
//            println("Child New")
//        }
//    }
}

fun main() {
    val childOne = Base.ChildOne()
    childOne.printText()
    val childTwo = Base.ChildTwo()
    childTwo.printText()
    val childThree = Base.ChildThree()
    childThree.printText()
}