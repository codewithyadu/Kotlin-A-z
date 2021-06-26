package basics.conditionsandloops

fun main() {
    val intList = listOf<Int>(1,2,3,4,5)
    //simpleForLoop(intList)
    //forUsingRangeExpression()
    //forUsingDownToOperator()
    //forIteratingUsingIndex(intList)
    forUsingWithIndex(intList)
}

fun simpleForLoop(list: List<Int>) {
    for (item in list) {
        println(item)
    }
}

fun forUsingRangeExpression() {
    for (i in 0..3) {
        println(i)
    }
}

fun forUsingDownToOperator() {
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}

fun forIteratingUsingIndex(list: List<Int>) {
    for (i in list.indices) {
        println(list[i])
    }
}

fun forUsingWithIndex(list: List<Int>) {
    for ((index, value) in list.withIndex()) {
        println("the element at $index is $value")
    }
}