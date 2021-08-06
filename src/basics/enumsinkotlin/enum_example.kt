package basics.enumsinkotlin

/**
 * Kotlin enums are classes
 * Enum constants aren’t just mere collections of constants- these have properties, methods etc
 * Each of the enum constants acts as separate instances of the class and separated by commas.
 * Enums increases readability of your code by assigning pre-defined names to constants.
 * An instance of enum class cannot be created using constructors.
 *
 * In Kotlin also enums can have a constructor like Java enums.
 * Since enum constants are instances of an Enum class, the constants can be
 * initialized by passing specific values to the primary constructor.
 *
 * Properties -
 * ordinal: This property stores the ordinal value of the constant,
 * which is usually a zero-based index.
 * name: This property stores the name of the constant.
 *
 * Methods –
 * values: This method returns a list of all the constants defined within the enum class.
 * valueOf: This methods returns the enum constant defined in enum, matching the input string. If the constant, is not present in the enum, then an IllegalArgumentException is thrown.
 */
enum class DAYS(val value: String) {
    MON("Monday"),
    TUE("Tuesday"),
    WED("Wednesday"),
    THU("Thursday"),
    FRI("Friday"),
    SAT("Saturday"),
    SUN("Sunday")
}

fun main() {
    val value = DAYS.MON.value
    println(value)
    for (days in DAYS.values()) {
        println("${days.ordinal} ${days.name} ${days.value}")
    }
}