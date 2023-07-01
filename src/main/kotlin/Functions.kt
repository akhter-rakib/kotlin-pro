/*main function from where the code start execution*/
fun main() {
    greeting("rakib", 18)
    greeting("Zamil", 15)
    /*Named Arguments*/
    greeting(age = 15, name = "Yesmin")
}

/*function with Parameters*/
fun greeting(name: String, age: Int, email: String = "default@mail") {
    println("Hello $name")
    if (age >= 16) {
        println("$name is an adult")
    } else {
        println("$name is not adult")
    }
}