package basics.inheritance

open class Employee(private val name: String, private val salary: Int) {
    fun employeeName() {
        println("Name of employee is : $name")
    }

    fun employeeSalary() {
        println("Salary of employee is : $salary")
    }

    open fun role(roleType: String) {
        println("The role is different for each employee")
    }
}

class AndroidDeveloperWithInheritance(private val name: String, private val salary: Int) : Employee(name, salary) {

    fun buildAndroidApp() {
        //logic of android app
        println("$name is building android app")
    }

    override fun role(roleType: String) {
        super.role(roleType)
        println("The role is : $roleType")
    }
}

class IOSDeveloperWithInheritance(private val name: String, private val salary: Int): Employee(name, salary) {

    fun buildIosApp() {
        //logic of iOS app
        println("$name is building iOS app")
    }

    override fun role(roleType: String) {
        super.role(roleType)
        println("The role is : $roleType")
    }
}

class WebsiteDeveloperWithInheritance(private val name: String, private val salary: Int): Employee(name, salary) {

    fun buildWebApp() {
        //logic of website
        println("$name is building website")
    }

    override fun role(roleType: String) {
        super.role(roleType)
        println("The role is : $roleType")
    }
}

fun main() {
    val androidDeveloper = AndroidDeveloperWithInheritance("Jack", 10000000)
    androidDeveloper.employeeName()
    androidDeveloper.employeeSalary()
    androidDeveloper.buildAndroidApp()
    androidDeveloper.role("android developer")
}