package instagram

data class UserDetailApiResponse(val name: String,
                                 val age: Int,
                                 val city: String,
                                 val pinCode: String,
                                 val occupation: String)

data class UserDetailItemState(
        val name: String,
        val age: Int,
        val occupation: String
)


fun main() {
    val userDetailApiResponseList = listOf<UserDetailApiResponse>(
            UserDetailApiResponse("Alok", 23, "Bhopal", "123456", "Software Engineer"),
            UserDetailApiResponse("Raman", 64, "Indore", "132323", "Business"),
            UserDetailApiResponse("Chetan", 41, "Ranchi", "156345", "Lawyer"),
            UserDetailApiResponse("Ganesh", 18, "Patna", "187909", "Student"),
            UserDetailApiResponse("Ajay", 35, "Kolkata", "109876", "Doctor")
    )
//
//    val useDetailItemStateList: List<UserDetailItemState> = userDetailApiResponseList.map {
//        UserDetailItemState(it.name, it.age, it.occupation)
//    }
//    println(useDetailItemStateList)

    val userDetailItemStateList = mutableListOf<UserDetailItemState>()

    userDetailApiResponseList.forEach {
        userDetailItemStateList.add(UserDetailItemState(it.name, it.age, it.occupation))
    }

    println(userDetailItemStateList)
}