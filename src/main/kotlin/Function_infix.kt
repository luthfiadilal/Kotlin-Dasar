fun main() {
    var nama = "Luthfi" to "UP"
    println(nama)
    nama = "Luthfi".to("DOWN")
    println(nama)

    val result = 2 tambahWe 22
    println(result)

    val person = "Luthfi" lastName "Adilal"
    println(person)

}

infix fun String.to(type : String): String{
    return if (type == "UP"){
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}



infix fun Int.tambahWe(value: Int): String{
    val hasil = this * value
    println(hasil)

    return if (hasil > 50){
        "Hasil lebih dari 50"
    } else {
        "Hasil kurang dari 50"
    }

}

infix fun String.lastName(value: String): String{
    return "Hello $this $value"
}