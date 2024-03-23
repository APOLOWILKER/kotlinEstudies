fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true, null, ?:)

    // functions - blocos de códigos reutilizáveis | Organizar código
    // E elea pode ter um tipo de retorno (Double String Int Long) caso n tenha retorno ()
    // escopo de funções
    // declaração e o corpo da função
//    olaMundo()
//    functionEnxuta()
    // Parametros NOMEADOS

    verificacaoParaLogin(age = 30, name = "Apolo", isAdmin = true) // argumentos nomeados
    verificacaoParaLogin(name = "Huge", isAdmin = false, age=27) // Posso reordenar os argumentos nomeados
    verificacaoParaLogin(17, "Bruce", false) // argumentos passados normalmente
    verificacaoParaLogin(15, "Arthur") // function sobrecarregada
}

//fun olaMundo() {
//    println("olaMundo")
//    println("OlaMundo 02 \n")
//}
//
//fun functionEnxuta() = println("Se tem uma linha não precisa de chaves")
// a função recebe parametros
fun verificacaoParaLogin(age: Int, name: String, isAdmin: Boolean) {
    println("Minha idade é $age e meu nome é $name, e sou admin: $isAdmin!")
}

// sobrecarga de metodo
fun verificacaoParaLogin(age: Int, name: String) {
    println("Instrução 2: Minha idade é $age e meu nome é $name!")
}