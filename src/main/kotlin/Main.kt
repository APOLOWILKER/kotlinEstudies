fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true)
    // primitivos 80%
    // int, double, string, short, byte, long, float, boolean, char


    // CONDIÇÕES (CONTROLE DE FLUXO)

    // se, senão -> DEVE SER UMA EXPRESSÃO BOOLEANA
    // (< , <= , >, >=, ! )

    val preco = 49
    val produto = "Teclado"

    // E = &&
    /*
    * TRUE | TRUE = true
    * TRUE | FALSE = false
    * FALSE | TRUE =  false
    * FALSE | FALSE = false
    */

    // OU = ||
    /*
    * TRUE | TRUE = true
    * TRUE | FALSE = true
    * FALSE | TRUE =  true
    * FALSE | FALSE = false
    */

    // Comparar String
    val produto1 = "iMac"
    val produto2 = "Iphone"
    println("comparação 01: " + produto1 == produto2)
    println("comparação 02: " + produto1 != produto2)
    println("comparação 03: " + produto1.equals(produto2))


}
