fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true, null, ?:)

    // functions - blocos de códigos reutilizáveis | Organizar código
    // E elea pode ter um tipo de retorno (Double String Int Long) caso n tenha retorno ()
    // escopo de funções
    // declaração e o corpo da função
    olaMundo()
    functionEnxuta()
    ageValidate()
}

fun olaMundo() {
    println("olaMundo")
    println("OlaMundo 02 \n")
}

fun functionEnxuta() = println("Se tem uma linha não precisa de chaves")

fun ageValidate() {
    val age = 31 // poderia ser um parametro
    if (age > 18) {
        println("Pode beber")
    }
    println("Não pode beber")
}