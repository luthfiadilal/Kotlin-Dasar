fun main() {
    fun sayHello(name: String): Unit{
        println("Hello $name")
    }

    sayHello("Upi")
}

fun satu(){
    // error
    //sayHello()
    sapa("Upi")

}

fun sapa(name: String){
    println("Hello $name")
}