fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true)


    // val é uma variavel IMUTAVEL
    // var é uma variavel MUTAVEL


    val preco = 54.90 //TIPO INFERIDO

    // TIPOS PRIMITIVOS


    // Mantendo/ reservando todo o espaço na memoria.
    val memorySafe = 192L // 64bit reservo todos os 64bit da memoria.

    // ESPAÇOS DE MEMORIA EM TIPOS PRIMTIVOS

    //NUMEROS
    val byte: Byte = 8            // 8-bit
    val short: Short = 16        // 16-bit
    val age: Int = 31            // 32-bit (99% do tempo)
    val long: Long = 192         // 64-bit

    val desconto: Float = 31.90f // 32-bit
    val price: Double = 331.90   // 64-bit ponto flutuante (floating point)

    // TEXTO
    val product: String = "Notebook"

    //BOOLEANO (TRUE | FALSE)
    val booleana = false // 1 byte (8bits)

    println(booleana::class)

        // padão CamelCase
    val mediaDePreco = 22

    val resposta = mediaDePreco.toDouble()

    println(resposta)



}
