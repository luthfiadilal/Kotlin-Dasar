inline fun hello(firstName: () -> String,
                 noinline lastName: () -> String): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun sayHello(name: () -> String): String {
    return "Hello ${name()}"
}

inline fun sapaNama(name: () -> String): String{
    return "Hai ${name()} apa kabar?"
}



fun main() {
    println(sapaNama { "Luthfi Adilal Mahbub" })
    println(sayHello { "Adilal" })
    println(hello({"Luthfi"}, {"Adilal"}))
}