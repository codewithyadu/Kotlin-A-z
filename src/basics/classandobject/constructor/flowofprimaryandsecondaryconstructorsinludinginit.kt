package basics.classandobject.constructor

/**
 * The hierarchy of call ->
 * 1.primary constructor
 * 2.init
 * 3.secondary constructor
 *
 * Note: If secondary constructor is called , the delegation first goes to
 * primary -> init -> comes back to secondary
 *
 * Note: If secondary constructor is not called
 * then statement inside secondary constructor are not executed
 */

class Person {
    var name = "Ravi"
    constructor(name: String) {
        this.name = name
        println("Name inside secondary constructor : $name")
    }

    init {
        println("Name inside init block : $name")
    }
}

class PersonOne(name: String) {
    var name = "Ravi"
    constructor(name: String, age: String): this(name) {
        println("Name inside secondary constructor : ${this.name}")
    }

    init {
        this.name = name
        println("Name inside init block : ${this.name}")
    }
}

class PersonTwo(private var name: String) {
    constructor(name: String, age: String): this(name) {
        //println("Name inside secondary constructor : $name") // constructor parameter name
        println("Name inside secondary constructor : ${this.name}") // class variable name
    }

    init {
        println("Name inside init block : $name")
        name = "Ravi Kishan"
    }
}

fun main() {
    //val person = Person("Raj")
    //val person = PersonOne("Raj", "23") // secondary constructor called
    //val person = PersonTwo("Raj", "23") // secondary constructor called
    //val person = PersonTwo("Raj") // secondary constructor not called
}