/*main function from where the code start execution*/
fun main() {
    greeting("rakib", 18)
    greeting("Zamil", 15)
}

/*function with Parameters*/
fun greeting(name: String, age: Int) {
    println("Hello $name")
    if (age >= 16) {
        println("$name is an adult")
    } else {
        println("$name is not adult")
    }
}