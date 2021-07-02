package basics.functionsinkotlin

/**
 *  A function without name is called anonymous function.
 *  For lambda expression we can say that it is anonymous function.
 *
 *  Syntax of lambda expression : "val lambda_name : Data_type = { argument_List -> code_body }"
 *  A lambda expression is always surrounded by curly braces,
 *  argument declarations go inside curly braces and have optional type annotations,
 *  the code_body goes after an arrow -> sign. If the inferred return type of the lambda
 *  is not Unit, then the last expression inside the lambda body is treated as return value.
 *
 */

fun main() {
    //println(sum1(10, 20))
    println(value("GHF"))
}

/**
 * Example 1 : with type annotation in lambda expression
 * Same fun using lambda :
 * fun sum1(a: Int, b: Int) {
 *   return a+b
 * }
 */
val sum1 = {a: Int, b: Int -> a + b}

/**
 * Example 1 : without type annotation in lambda expression
 */
val sum2: (Int, Int) -> Int = {a, b -> a + b}

/**
 * Lambdas examples with return type
 */
val lambda1: (Int) -> Int = {a -> a * a}
val lambda2: (String,String) -> String = { a , b -> a + b }
val lambda3: (Int)-> Unit = {print(Int)}

/**
 * if we have lambda with single parameter then we don't need to pass
 * the parameter name explicitly.
 * The parameter is inferred as "it".
 */
/*val numbers = arrayOf(1,2,3,4)
val lambdaWithSingleParameter = numbers.forEach {
    println(it)
}*/

/**
 * Lambdas returning value
 */
val value = {type: String ->
    when(type) {
        "ABC" -> {
            "It is ABC"
        }
        "XYZ" -> {
            "It is XYZ"
        }
        else -> {
            "No match found"
        }
    }
}

/**
 * If the lambda parameter is unused, you can place an underscore instead of its name:
 */
/*
val nameMap = mapOf(1 to "Yadu", 2 to "Sushil", 3 to "Gireesh", 4 to "Kharbanda")
val unusedParameterInsideMap = nameMap.forEach { _, value ->
    println(value)
}*/
