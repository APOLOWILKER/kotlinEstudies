fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true, null, ?:)

    // functions - blocos de códigos reutilizáveis | Organizar código
    // E elea pode ter um tipo de retorno (Double String Int Long) caso n tenha retorno ()
    // escopo de funções
    // declaração e o corpo da função
//    olaMundo()
//    functionEnxuta()
    // Parametros NOMEADOS

    cadastroDeUsuario(name = "Bruce", age = 18)
    cadastroDeUsuario(22, "Amy", false)
    cadastroDeUsuario(name = "Tiago", age = 26)
    cadastroDeUsuario(name = "Apolo", age = 30, isAdmin = true)
}

// a função recebe parametros
// Podemos adicionar parametros default na function
fun cadastroDeUsuario(age: Int = 0, name: String, isAdmin: Boolean = false) {
    println("Usuário cadastrado com idade: $age, nome: $name, admin: $isAdmin")
}
