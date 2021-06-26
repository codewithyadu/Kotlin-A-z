package basics.classandobject.constructor.secondary

/**
 * The class can also declare secondary constructors, which are prefixed with constructor:
 */
class Person {
    constructor(name: String) {
        println(name)
    }
}

/**
 * If the class has a primary constructor, each secondary constructor needs to delegate to the
 * primary constructor, either directly or indirectly through another secondary constructor(s).
 * Delegation to another constructor of the same class is done using the this keyword:
 *
 * if not done following error comes :
 * Primary constructor call expected
 */
class Person1(val name: String) {
    constructor(name: String, age: Int): this(name) {
        println("$name, $age")
    }
}

/**
 * Code in initializer blocks effectively becomes part of the primary constructor.
 * Delegation to the primary constructor happens as the first statement of a secondary constructor,
 * so the code in all initializer blocks and property initializers is executed before the secondary
 * constructor body.
 */
class Person2(val name: String) {
    init {
        println("Init block")
    }
    constructor(name: String, age: Int): this(name) {
        println("$name, $age")
    }
}

/**
 * Even if the class has no primary constructor, the delegation still happens implicitly,
 * and the initializer blocks are still executed:
 */
class Person3 {
    init {
        println("Init block")
    }
    constructor(name: String, age: Int) {
        println("$name, $age")
    }
}


/**
 * Note :
 * If a non-abstract class does not declare any constructors (primary or secondary),
 * it will have a generated primary constructor with no arguments. The visibility of the
 * constructor will be public.
 *
 * If you don't want your class to have a public constructor,
 * declare an empty primary constructor with non-default visibility:
 *
 * Example :
 * class DontCreateMe private constructor () { /*...*/ }
 */
fun main() {
    //val person = Person("Yadu")
    //val person1= Person1("Yadu", 23)
    //val person2= Person2("Yadu", 23)
    val person3= Person3("Yadu", 23)
}