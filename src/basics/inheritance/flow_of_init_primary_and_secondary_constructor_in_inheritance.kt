package basics.inheritance

/**
 * Example without secondary constructor
 *
 * Flow is :-
 * 1.Derived class gives the call to base class
 * 2.In base class primary constructor called -> init called ->
 * flow back to derived class -> primary constructor of derived class ->
 * init block of derived class
 *
 */
open class Baby(private val name: String) {
    init {
        println("Name of baby is : $name")
    }
}

class BabyBoy(private val name: String, private val gender: String): Baby(name) {
    init {
        println("Gender of baby is : $gender")
    }
}

/**
 * Example without secondary constructor
 *
 * Flow is :-
 * 1.Derived class secondary constructor gives call to
 * primary constructor
 * 2.Primary constructor of derived class gives call back to secondary constructor of
 * base class
 * 3.Secondary constructor of base class gives call to primary constructor of base class
 * 4.Base class primary constructor executed -> init block of base class executed  ->
 * secondary constructor of base class executed
 * 5.call back to derived class
 * 6.primary constructor of derived class executed -> init block of
 * derived class executed -> secondary constructor of derived class
 * executed
 *
 */
open class NewBaby(private val name: String) {
    init {
        println("Base class init block")
    }

    constructor(name: String, country: String): this(name) {
        println("Base class secondary block")
    }
}

class NewBabyBoy(private val name: String, private val country: String, private val gender: String): NewBaby(name, country) {
    init {
        println("Derived class init block")
    }

    constructor(name: String, country: String, gender: String, fathersName: String): this(name, country, gender) {
        println("Derived class secondary block")
    }
}

fun main() {
    //val babyBoy = BabyBoy("Jackson", "female")
    val newBabyBoy = NewBabyBoy("Jackson", "England", "Male", "John")
}