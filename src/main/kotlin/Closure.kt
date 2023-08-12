fun main() {
    var counter = 0
    val lambdaFun: () -> Int = {
        println("lambda increment")
        counter++
    }

    val anonymousincrement = fun(){
        println("Anonymous function increment")
        counter++
    }

    fun fungsiIncrement(){
        println("fungsi increment")
        counter++
    }

    lambdaFun()
    anonymousincrement()
    fungsiIncrement()

    println(counter)
}