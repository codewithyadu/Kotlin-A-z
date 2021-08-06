package basics.objectinkotlin

class ABC {
    companion object {
        private var count = 0

        fun count(){
            count++
        }
    }

    fun getCount(): Int {
        return count
    }
}

fun main() {
    val abc = ABC()
    val xyz = ABC()
    ABC.count()
    println(abc.getCount())
    ABC.count()
    println(xyz.getCount())
    println(abc.getCount())
}