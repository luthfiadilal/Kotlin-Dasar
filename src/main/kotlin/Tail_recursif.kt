fun main() {
//    display(10000)
    println(factorial(11, 1))
}

tailrec fun display(value: Int){
    println(value)
    if (value > 0){
        // tail recursip
        display(value - 1)
    }
}

tailrec fun factorial(value: Int, total: Int): Int{
    return when(value){
        1 -> total
        else -> factorial(value - 1, total * value )
    }
}