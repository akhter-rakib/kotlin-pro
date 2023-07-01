fun main() {
    /*Object Declaration*/
    val tv = SmartDevice()
    tv.brand = "Samsung"
    tv.price = 1234.34
    val ac = SmartDevice()
    ac.brand = "General"
    ac.price = 126.45
}

/*Blue Print*/
class SmartDevice {
    var brand: String = ""
    var price: Double = 0.0
}