fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true, null, ?:, return)

    // functions, escopo, fluxo if else, retornos, tipos, manipulação de memoria.

    // functions - blocos códigos reutilizaveis | organizar

    // POO - Oriented object Programing

    // DRY - Dont Repeat Yourself = Não faça coisas repetitivas

    // Molde (TEMPLATE)
    // class (molde responsavel por criar N objetos (propriedade))

    // CONSTRUTOR - Posso pré Preencher uma propriedade dentro

    val userA = User()
    val userB = User()

    userA.name = "Apolo"
    userB.name = "Thiago"

    userA.printUpperCase()
    userB.printUpperCase()

    userA.updateName("Apolo Wilker")

    userA.printUpperCase()

    val userALength = userA.getNameLength()
    println(userALength)

    println(userB.getNameLength())
}
