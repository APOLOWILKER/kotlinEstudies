fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true)
    // primitivos 80%
    // int, double, string, short, byte, long, float, boolean, char


    // CONDIÇÕES (CONTROLE DE FLUXO)
    val produto = "iPhone"
    println(produto.length)
    // se, senão -> DEVE SER UMA EXPRESSÃO BOOLEANA
    // (< , <= , >, >=, ! )

    val preco = 30_001
    if (preco >= 20_000 && preco < 30_000) {
        println("Você ganhou 20% de desconto")
    } else if (preco > 30_000) {
        println("Você ganhou 30% de desconto")
    } else if (preco > 10_000) {
        println("você ganhou 10% de desconto")
    } else {
        println("Você não ganhou desconto")
    }
}
