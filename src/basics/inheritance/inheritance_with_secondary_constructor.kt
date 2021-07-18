package basics.inheritance

/**
 * If derived class does not have a primary constructor
 * then secondary constructor should make a call to primary constructor
 */
open class University(private val name: String, val branch: String) {

}

class Student : University {
    constructor(name: String, branch: String, marks: String): super(name, branch) {

    }
}

/**
 * if base class has both primary and secondary constructor, then derived class can call
 * either primary or secondary constructor.
 * Here in this example derived class is calling secondary constructor
 * and secondary constructor of base class internally makes call to primary constructor
 */
open class NewUniversity(private val name: String, val branch: String) {
    constructor(name: String, branch: String, batch: String): this(name, branch){

    }
}

class StudentNew : NewUniversity {
    constructor(name: String, branch: String, batch: String, marks: String): super(name, branch, batch) {

    }
}



