fun main() {
    println(factorialLoop(5))
    println(factorial(6))
}

fun factorialLoop(values: Int): Int{
    var result = 1
    for (i in values downTo 1){
        result *= i
    }

    return result
}

fun factorial(value: Int): Int{
/**
    return when(value){
        1 -> 1
        else -> value * factorial(value - 1)

    }
*/

    return if (value == 1){
        1
    } else {
        value * factorial(value - 1)
    }
}




