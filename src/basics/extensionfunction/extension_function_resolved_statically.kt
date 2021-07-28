package basics.extensionfunction

/**
 * In inheritance, methods and parameters are dynamically resolved
 * BUT
 * the extension functions is that they are resolved statically
 * i.e which extension function is executed depends totally on
 * the type of the expression on which it is invoked, rather than
 * on the type resolved on the final execution of the expression
 * at runtime.
 */
open class A {
    open fun play() {
        println("Inside class A")
    }
}

class B : A() {
    override fun play() {
        println("Inside class B")
    }
}

fun A.check() {
    println("Inside class A")
}

fun B.check() {
    println("Inside class B")
}

fun main() {
    //Dynamically resolved
    val a: A = A()
    val newA: A = B()
    a.play()
    newA.play()

    //Statically resolved
    a.check()
    newA.check()
    val b: B = B()
    b.check()
}