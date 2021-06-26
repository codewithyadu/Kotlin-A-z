package basics.functionsinkotlin

fun main() {
    //user("Yadu")
    //userWithDefaultArguments("Yadu")
    //userWithDefaultArguments(name = "Yadu", city = "Hyderabad")
    //usersWithVarArgsArguments("Yadu","Sushil","Gireesh")
    //usersWithVarArgsArgumentsAndOtherArguments("Yadu","Sushil","Gireesh",age = 23, city = "Bangalore")

    //use of spread operator (*)
      //val userArray = arrayOf("Yadu", "Sushil", "Gireesh")
      //usersWithVarArgsArguments(*userArray)

    println(userWithReturnType("Yadu"))
}

/**
 * Simple function with no return type
 */
fun user(name: String): Unit {
    println("Name of user is $name")
}

fun userWithDefaultArguments(name: String, age:Int = 23, city: String = "Bangalore") {
    println("Name of user is $name, Age of user is $age, City of user is $city")
}

/**
 * Each function can have at most one vararg parameter.
 * If we declare a function with more than one vararg parameter,
 * the Kotlin compiler will fail with an error:
 */
fun usersWithVarArgsArguments(vararg name: String) {
    name.forEach {
        println(it)
    }
}

/**
 * Varargs combined with other arguments then while calling use named arguments
 * like :
 * usersWithVarArgsArgumentsAndOtherArguments("Yadu","Sushil","Gireesh",age = 23, city = "Bangalore")
 */
fun usersWithVarArgsArgumentsAndOtherArguments(vararg name: String, age: Int, city: String) {
    name.forEach {
        println("$it : $age $city")
    }
}

/**
 * function with return type
 */
fun userWithReturnType(name: String): String {
    return name
}