fun main() {
    val lambdaName: (String) -> String = {
        "Hello $it"
    }

    val contoh: (Int, Int) -> Int = {a: Int, b: Int ->
        val result = a * b / 2
        result
    }

    val fungsi = { nama: String ->
        "Hello $nama apa kabar?"
    }

    val besarkan: (String) -> String = ::toUpper

    val name = lambdaName("luthfi")
    val hasil = contoh(12, 7)
    println(besarkan("luthfi adilal mahbub"))
    println(fungsi("Alex"))
    println(name)
    println(hasil)
}

fun toUpper(value:String): String = value.toUpperCase()