package basics.interfaceinkotlin

interface Sports {
    fun play()
}

interface SportsOne : Sports {
    fun gamesRules()
}

class Player : SportsOne {
    override fun gamesRules() {
        TODO("Not yet implemented")
    }

    override fun play() {
        TODO("Not yet implemented")
    }

}