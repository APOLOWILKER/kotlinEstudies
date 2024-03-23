fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true)
    // primitivos 80%
    // int, double, string, short, byte, long, float, boolean, char


    // CONDIÇÕES (CONTROLE DE FLUXO)

    // se, senão -> DEVE SER UMA EXPRESSÃO BOOLEANA
    // (< , <= , >, >=, !, ?, ?: )

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

    // Ponteiros de referencia para  conteudos inexistentes
    // Segurança de dados
    /*
    * Temos 3 situações para armazenar dados na váriavel.
    * dentro de um endereço de memoria (101101) armazeno, caracter, sequencia de caracter ou numero
    * Posso armazenar uma sequencia de palavras.
    * Posso armazenar algo que seja vazio " "
    * Posso rezervar o espaço e não colocar nada nele = null
    */

    // OBJETO -> NULL

    var produto: String = "iMac" // variavel multavel
    produto = "iPhone"
//    produto = null // não é possivel fazer isso para fazer isso preciso fazer de outro modo.

    // Nulable
    var example: String? = "nulable" // usado para casos de  campo que podem ou n ser preenchidos
    println(example)
    example = null // isso pode fazer


    // pode ser que tenha Null
    var endereco: String? = "Rua A"
    val qtdExample2 = endereco?.length // safe calls ou optional chaining
    // ?: - operador elves | Elves operator
    // para definir um valor padrão caso a expressão não seja correspondida.
    // val qtdElvesExample = if (endereco != null) endereco.length else 0
    val qtdElvesExample = endereco?.length ?: 0

    println("Validação condicional:  $qtdExample2" )

    if (endereco != null) {
        val qtdDeCaracteres = endereco.length
        println(qtdDeCaracteres)
    }

}
