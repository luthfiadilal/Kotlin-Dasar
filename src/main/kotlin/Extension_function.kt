fun main() {
    val name = "Luthfi"
    println(name.hello())
    name.hello()

    val angka = 2
    val result = angka.kurangi(2,10)
    println(result)


}

fun String.hello(): String {
    return "Hello $this"
}

fun Int.kurangi(a: Int, b: Int): Int {
    return a * this - b
}