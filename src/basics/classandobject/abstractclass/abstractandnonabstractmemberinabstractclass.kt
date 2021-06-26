package basics.classandobject.abstractclass

/**
 * 1.In Kotlin, abstract class is declared using the abstract keyword in front of class.
 * 2.An abstract class can not instantiated means we can not create object for the abstract class.
 * 3.We can’t create an object for abstract class.
 * 4.All the variables (properties) and member functions of an abstract class are by default non-abstract.
 * So, if we want to override these members in the child class then we need to use open keyword.
 * 5.If we declare a member function as abstract then we does not need to annotate with open keyword
 * because these are open by default.
 * 6.An abstract member function doesn’t have a body, and it must be implemented in the derived class.
 */

abstract class Employee(private val name: String, private val exp: Int) {
    abstract var salary: Double
    abstract fun dateOfBirth(date: String)

    fun employeeDetails() {
        println("Name of the employee: $name")
        println("Experience in years: $exp")
        println("Annual Salary: $salary")
    }
}

class Engineer(name: String, exp: Int): Employee(name, exp) {
    override var salary: Double = 50000.00

    override fun dateOfBirth(date: String) {
        println("Date of Birth is: $date")
    }
}

fun main() {
    val engineer = Engineer("Yadu", 2)
    engineer.employeeDetails()
    engineer.dateOfBirth("11 - 08 - 1995")
}
