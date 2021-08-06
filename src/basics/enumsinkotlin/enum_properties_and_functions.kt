package basics.enumsinkotlin

enum class NEWDAYS(val value: String = "default") {
    MON,
    TUE,
    WED,
    THU,
    FRI("Friday"),
    SAT,
    SUN;

    companion object {
        fun isItMonday(obj: NEWDAYS): Boolean = (obj.value == NEWDAYS.MON.value)
    }
}

fun main() {
    println(NEWDAYS.isItMonday(NEWDAYS.FRI))

    when(NEWDAYS.MON) {
        NEWDAYS.MON -> {
            println(NEWDAYS.MON.value)
        }
        NEWDAYS.FRI -> {
            println(NEWDAYS.FRI.value)
        }
        else -> {
            println("No day found")
        }
    }
}