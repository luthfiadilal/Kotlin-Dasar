fun main() {
    hello(
        lastName = "Smith",
        firstName = "John",
        age = 30
    )
}


fun hello(firstName: String, lastName: String, age: Int) {
    println("Hello $firstName $lastName, i am $age years old.")
}