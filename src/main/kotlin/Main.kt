fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int)


    // val é uma variavel IMUTAVEL
    // var é uma variavel MUTAVEL


    val preco = 54.90 //TIPO INFERIDO

    // TIPOS PRIMITIVOS


    // ESPAÇOS DE MEMORIA EM TIPOS PRIMTIVOS

    val price: Double = 9100.90
    val byte: Byte = 8 // 8-Bit
    val short: Short = 16 // 16-bit
    val age: Int = 30 // 32-Bit (99% do tempo)
    val long = 192031982309 // 64bit

    // Mantendo/ reservando todo o espaço na memoria.
    val memorySafe = 192L // 64bit reservo todos os 64bit da memoria.

    var product: String = "macbook"



    println("Você que um $product ?")
    println("Sabia que o valor de um $product é $ $price")
    println(price::class)
    println(age::class)
    println(product::class)
    print(long::class)
}
