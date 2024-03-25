fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true, null, ?:, return)

    // functions, escopo, fluxo if else, retornos, tipos, manipulação de memoria.

    // functions - blocos códigos reutilizaveis | organizar

    // POO - Oriented object Programing

    // DRY - Dont Repeat Yourself = Não faça coisas repetitivas

    // Molde (TEMPLATE)
    // class (molde responsavel por criar N objetos (propriedade))

    // CONSTRUTOR - Posso pré Preencher uma propriedade dentro

    // SOBRECARGA DE CONSTRUTOR (IGUAL A DE FUNÇÃO)

    val userA = User("Apolo", true)

    val nameLength = userA.getNameLength()
    println(nameLength)
    println(userA.name)
    println(userA.isAdmin)


    val userB = User("Gustavo")
    println(userB.getNameLength())
    println(userB.name)
    println(userB.isAdmin)

}
