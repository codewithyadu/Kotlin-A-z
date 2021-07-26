package basics.interfaceinkotlin

interface Company {
    fun companyName()
    fun companyType() {
        println("Software")
    }
}

interface Job {
    fun jobTitle()
    fun companyType() {
        println("Mobile App")
    }
}

class Employee : Company, Job {
    override fun companyName() {
        println("Company name is ABC")
    }

    override fun companyType() {
        super<Company>.companyType()
        super<Job>.companyType()
    }

    override fun jobTitle() {
        println("Job title is XYz")
    }
}