fun main() {
    val upperTransformer = { value: String -> value.toUpperCase()}
    println(hello("luthfi", upperTransformer))

    // Trailing lambda
    val result = hello("adilal") {
        value: String -> value.toUpperCase()
    }

    println(result)

}

fun hello(value:String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}"
}