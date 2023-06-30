fun main() {
    /*Here we are putting triple double quotation for multi line text */
    var msg = """
        Hello %s
        How are you?
        your score is %d
    """.trimIndent()
    println(msg.format("Rakib", 5))

}