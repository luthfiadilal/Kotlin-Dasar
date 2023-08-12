fun main(){
    hello(
        lastName = "Mahbub",
        firstName = "Luthfi",
        middleName = "Adilal"
    )

    println(matematik(
        b = 12,
        a = 6
    ))
}

fun hello(firstName: String, middleName: String, lastName: String){
    println("Hallo $firstName $middleName $lastName apa kabar?")
}

fun matematik(a: Int, b: Int): Int {
    val result = a * b + 2 / 2
    return result
}



