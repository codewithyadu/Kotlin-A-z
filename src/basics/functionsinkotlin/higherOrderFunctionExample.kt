package basics.functionsinkotlin

/**
 * In Kotlin, a function which can accepts a function as parameter
 * or can returns a function is called Higher-Order function.
 */

fun main() {
    //firstExample(lambda)
    //secondExample(sumLambda)
    //firstExampleWithFunctionAsParameter(::returnedValueAsString)
    //secondExampleWithFunctionAsParameter(::addValue)
    val addValue = higherOrderFunctionReturningFunction()
    println(addValue(40, 20))
}

val lambda = { println("Simple lambda function without return value")}
val sumLambda = {a: Int, b: Int -> a+b}
fun returnedValueAsString(value : String): String {
    return value
}

fun addValue(a: Int, b: Int) = a+b

/**
 * Higher order function with lambda as parameter
 */
fun firstExample(value: () -> Unit) {
    value()
}

/**
 * Higher order function with lambda as parameter
 */
fun secondExample(value : (a: Int,b: Int) -> Int) {
    println(value(10, 20))
}

// Now see example of function passing as parameter

/**
 * Higher order function with function as parameter
 */
fun firstExampleWithFunctionAsParameter(stringFunctionValue: (String) -> String) {
    println(stringFunctionValue("Hello World"))
}

/**
 * Higher order function with function as parameter
 */
fun secondExampleWithFunctionAsParameter(additionFunctionValue: (Int, Int) -> Int) {
    println(additionFunctionValue(10, 20))
}

fun higherOrderFunctionReturningFunction(): ((Int, Int) -> Int) {
    return ::addValue
}