fun main() {
    println(finalValue("Luthfi", 2,6,8,1,12,7,4,36,27))
}

fun finalValue(name: String, vararg values: Int) {
    var total = 0.0
    for (value in values){
        total += value
    }

    println("Final value $name = $total")
}