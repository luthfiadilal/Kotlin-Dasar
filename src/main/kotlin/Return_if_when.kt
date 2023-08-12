fun main() {
    println(sayHello())
    println(sayHello("Luthfi"))

    println(hitungan(12, 38))
    println(ngitung(32, 17))
 

}

fun sayHello(name: String = ""): String{
    return if (name == ""){
        "Hello bro"
    } else {
        "Hello $name"
    }
}

fun hello(nama: String = ""): String{
    return when(nama) {
        "" -> "Hello bro"
        else -> "Hello $nama"
    }
}

fun hitungan(angka1: Int, angka2: Int): String{
    val hasilHitung = (angka1 + angka2) * 2
    println(hasilHitung)
    return if (hasilHitung > 50){
        "hasilnya = $hasilHitung ini lebih dari 50"
    } else {
        "Hasilnya = $hasilHitung ini kurang dari 50"
    }

}

fun ngitung(nilai1: Int, nilai2: Int): String{
    val hasilNgitung = (nilai1 + nilai2) * 2
    println(hasilNgitung)

    return when(hasilNgitung){
        50 -> "Lebih dari 50"
       else -> "Kurang dari 50"
    }
}

