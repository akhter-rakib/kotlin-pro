fun main() {
    /*Object Declaration*/
    val tv = SmartDevice()
    tv.brand = "Samsung"
    tv.price = 1234.34
    val ac = SmartDevice()
    ac.brand = "General"
    ac.price = 126.45
    println(ac.price)
}

/*Blue Print*/
class SmartDevice {
    var brand: String = ""
        get() = field
        set(value) {
            field = value
        }
    var price: Double = 0.0
        get() = 23.45
}