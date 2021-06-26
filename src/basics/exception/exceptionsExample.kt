package basics.exception

import java.lang.Exception

fun main() {
    tryCatchExceptionExample()
}

/**
 * To throw an exception object, use the throw expression
 * Note : By throwing an exception, app does not crash
 */
fun throwingAnException() {
    throw Exception("Hello There")
}

/**
 * To catch an exception, use the try ... catch expression
 * There may be zero or more catch blocks. finally block may be omitted.
 * However, at least one catch or finally block should be present.
 */
fun catchingAnException() {
    try {
        // some code
    }catch (e: Exception) {
        // handler
    }finally {
        // optional finally block
    }
}

/**
 * try is an expression; thus, it can have a return value
 */
fun tryAsExpression(x: Int) {
    val a:Int? = try {
        //some code
        null
    }catch (e: Exception) {
        null
    }
}

fun tryCatchExceptionExample() {
    try {
        divide(10, 0)
    }catch (e: Exception) {
        println("Exception : ${e.message}")
    }finally {
        println("Finally block executed")
    }
}

fun divide(a: Int, b: Int) {
    println("Division is a/b:${a/b}")
}