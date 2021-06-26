package instagram

data class Employee(
        val name: String,
        val skill: String
)

fun main() {
    val employeeList = listOf<Employee>(
            Employee("Rahul", "Android Developer"),
            Employee("Vishal", "NodeJs Developer"),
            Employee("Kaushik", "NodeJs Developer"),
            Employee("John", "Android Developer")
    )

    val newEmployeeList: List<Employee> = employeeList.map {
        if (it.skill == "Android Developer"){
            it.copy(skill = "Frontend Developer")
        } else {
            it.copy(skill = "Backend Developer")
        }
    }

    println(newEmployeeList)
//    val newEmployeeList = mutableListOf<Employee>()
//
//    employeeList.forEach {
//        if (it.skill == "Android Developer"){
//            newEmployeeList.add(it.copy(skill = "Frontend Developer"))
//        } else {
//            newEmployeeList.add(it.copy(skill = "Backend Developer"))
//        }
//    }
//
//    println(newEmployeeList)
}