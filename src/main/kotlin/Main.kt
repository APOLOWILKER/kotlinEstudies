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


    if (preco == 49 && produto == "Teclado") { // expressoes compostas
        println("Sucesso")
    } else {
        println("Falhou")
    }

}
