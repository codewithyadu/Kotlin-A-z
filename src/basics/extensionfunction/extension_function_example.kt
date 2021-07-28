package basics.extensionfunction

/**
 * Kotlin gives the programmer the ability to add more functionality to
 * the existing classes, by without inheriting them. This is achieved
 * through a feature known as extensions. When a function is added
 * to an existing class it is known as Extension Function.
 */

class Cricket(val teamName: String, private val totalScore: String) {
    fun totalScoreOfTeam() {
        println("$teamName scored: $totalScore")
    }
}

fun Cricket.manOfTheMatch(playerName: String) {
    println("$playerName of team ${this.teamName} is man of the match")
}

fun main() {
    val cricket = Cricket("India", "310")
    cricket.manOfTheMatch("Rohit Sharma")
}