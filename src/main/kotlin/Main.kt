fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true, null, ?:)

    // functions, escopo, fluxo, if else, retornos, tipos, manipulação de memoria.

    // functions - blocos de códigos reutilizáveis | Organizar código
    // E elea pode ter um tipo de retorno (Double String Int Long) caso n tenha retorno ()
    // escopo de funções
    // declaração e o corpo da função
//    olaMundo()
//    functionEnxuta()
    // Parametros NOMEADOS

    val resultadoDaMultiplicacao = multiplicar(2.0, 3.5)

    println("Resultado da some é: ${somar(2, 3)}")
    println("Resultado da multiplicação é $resultadoDaMultiplicacao")
}

fun somar(x: Int, y: Int): Int {
    return x + y
}

fun multiplicar(x: Double, y: Double): Double {
    return  x * y
}