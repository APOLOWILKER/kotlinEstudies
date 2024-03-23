fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true, null, ?:)

    // functions - blocos de códigos reutilizáveis | Organizar código
    // E elea pode ter um tipo de retorno (Double String Int Long) caso n tenha retorno ()
    // escopo de funções
    // declaração e o corpo da função
    olaMundo()
    functionEnxuta()
    ageValidate(18)
}

fun olaMundo() {
    println("olaMundo")
    println("OlaMundo 02 \n")
}

fun functionEnxuta() = println("Se tem uma linha não precisa de chaves")

fun ageValidate(age: Int) {
    if (age >= 18) {
        println("\n Pode beber! \n")
    }
    println("\n Não pode beber!\n")
}