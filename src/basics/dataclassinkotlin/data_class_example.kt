package basics.dataclassinkotlin

/**
 * The compiler automatically derives the following functions for data class:
 * equals()
 * hashCode()
 * toString()
 * copy()
 */

/**
 * Data classes have to fulfill the following requirements to ensure the consistency:
 * The primary constructor needs to have at least one parameter.
 * All primary constructor parameters need to be marked as val or var.
 * Data classes cannot be abstract, open, sealed or inner.
 * Data classes may only implement interfaces.
 */
data class Student(val name: String, val rollNo: String, val subject: String, val cityCode: Int = 10)

/**
 * 1.toString() :-
 * This function returns a string of all the parameters defined in the data class .
 *
 * 2.copy(
 * Sometimes we need to copy an object, with some change in some of its properties
 * keeping all others unchanged. In this case copy() function is used.
 *
 * 3.equals
 * method return true if two objects have same contents and it works similar to “==”
 *
 * 4.hashcode
 * function returns a hash code value for the object.
 * If two objects are equal according to equals() method, then the hash codes
 * returned will also be same
 */
fun main() {
    //1.toString
    val student = Student("Rahul", "16752", "Maths")
    println(student.toString())
    println(student.cityCode.toString())

    //2.copy()
    val student2 = student.copy(name = "Roshan")
    println(student2.toString())

    //3.equals
    val student3 = student.copy()
    println(student.equals(student3))

    //4.hashcode
    println(student.hashCode())
    println("Hash code for student1: ${student.hashCode()} same as student2: ${student3.hashCode()}")

}