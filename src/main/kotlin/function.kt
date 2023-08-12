fun main(){
    greeting()
    halo("Luthfi", null)
}

fun greeting(){
    println("Hallo semuanya")
}

fun halo(nama: String , otherName: String?){
    if (otherName == null){
        println("Hallo $nama")
    } else {
        println("Hallo $nama $otherName")
    }
}