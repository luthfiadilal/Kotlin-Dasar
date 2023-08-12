const val nama = "Luthfi"
val names = "Adilal"

fun main(){
    println(names)
    println(nama)
    hello("Alex")
    hello("Luthfi", "Adilal")
}

fun hello(firstname: String, lastName: String = ""){
    println("Hallo $firstname $lastName")
}
