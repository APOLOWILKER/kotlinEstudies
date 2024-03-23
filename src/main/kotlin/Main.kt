fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true, null, ?:)

    // functions - blocos de códigos reutilizáveis | Organizar código
    // E elea pode ter um tipo de retorno (Double String Int Long) caso n tenha retorno ()

    val resposta = somar() // call

    // usa série de códigos

    println(resposta)
    olaMundo()
}

// funcao sem retorno igual a main
fun olaMundo() {
    println("olá Mundo")
}

// funcao com retorno  (String)
fun somar(): String {
    // por padrão o tipo Unit é omitido não precisa ser chamado
    val resultado = 2 + 3
    return "Estou somando 2 com 3 e o resultao é: $resultado"
}
