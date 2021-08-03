package basics.sealedclassinkotlin

sealed class Sports {
    data class Cricket(val numberOfPlayers : String) : Sports()
    object Football : Sports()
    class Hockey(): Sports() {
        fun play() {
            println("Play Hockey")
        }
    }
}

fun main() {
    val sports = Sports.Hockey()
    printSports(sports)
}

/**
 * A sealed class is most commonly used with a when clause, as the types to which
 * a sealed class reference can conform to are limited. This completely eliminates
 * the use of else clause.
 */
fun printSports(sports: Sports) {
    when(sports) {
        is Sports.Cricket -> {
            println(sports.numberOfPlayers)
        }
        is Sports.Football -> {
            println("Football")
        }
        is Sports.Hockey -> {
            sports.play()
        }
    }
}