fun main() {
    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("Luthfi") test@{
        if (it == ""){
            return@test
        }else {
            println("Luthfi")
        }
    }
    println(labeBreak())
}

fun labeBreak(){
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i > 5){
                break@loopI
            }
            println("loop (I) $i * loop (J) $j = ${i * j} ")

        }
    }
}

fun labelContinue(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (i == 10){
                continue@loopI

            }
            println("loop (I) $i * loop (J) $j = ${i * j} ")


        }
    }
}