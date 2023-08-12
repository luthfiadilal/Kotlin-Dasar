fun main() {
    val anonymousFun = fun(value: String): String {
        return if (value.isBlank()){
            "Ups"
        } else {
            value.toUpperCase()
        }
    }

    println(hallo("luthfi", anonymousFun))
    println(hallo("", anonymousFun))
}

fun hallo(value:String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}"
}
