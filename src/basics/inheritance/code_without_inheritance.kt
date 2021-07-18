package basics.inheritance

/**
 * Inheritance is one of the more important features in object-oriented programming.
 * Inheritance enables code re-usability, it allows all the features from an existing class(base class)
 * to be inherited by a new class(derived class). In addition, the derived class can also add some features
 * of its own.
 */

class AndroidDeveloper(private val name: String, private val salary: Int) {
    fun employeeName() {
        println("Name of employee is : $name")
    }

    fun employeeSalary() {
        println("Salary of employee is : $salary")
    }

    fun buildAndroidApp() {
        //logic of android app
        println("$name is building android app")
    }
}

class IOSDeveloper(private val name: String, private val salary: Int) {
    fun employeeName() {
        println("Name of employee is : $name")
    }

    fun employeeSalary() {
        println("Salary of employee is : $salary")
    }

    fun buildIosApp() {
        //logic of iOS app
        println("$name is building iOS app")
    }
}

class WebsiteDeveloper(private val name: String, private val salary: Int) {
    fun employeeName() {
        println("Name of employee is : $name")
    }

    fun employeeSalary() {
        println("Salary of employee is : $salary")
    }

    fun buildWebApp() {
        //logic of website
        println("$name is building website")
    }
}