class TestClass { // extra spaces

    fun sayHello() { // wrong spacing
        println("Hello, Ktlint!") // space after (
    }

    fun add(
        a: Int,
        b: Int,
    ): Int = a + b // spacing + compact function
}
