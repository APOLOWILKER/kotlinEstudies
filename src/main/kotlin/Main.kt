fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true)
    // primitivos 80%
    // int, double, string, short, byte, long, float, boolean, char

    // formatação de textos
    //1.
    val mensagge = "Olá Apolo, \n seu produto chegou!"
    println("Tipo 01: \n $mensagge")
    // 2.
    val welcome = """
       Olá Apolo.
        Seu Produto chegou!!
    """.trimIndent() // para manter a formatação do código.
    println("Tipo 02: \n $welcome")


    // 03.
    val firstName = "Apolo"
    val age = 30
    val price = 300
    val desconto = 3
    println("Tipo 03: \n olá " + firstName + " sua idade é " + age)

    // 04

    println("Tipo 04: \n Olá $firstName. Sua idade é $age, " +
            "e o produto que comprou custa $price então " +
            "seu desconto é ${(price * desconto)/100} reais \n " +
            "O valor final do produto é ${price - ((price * desconto)/100)} "

    )
}
