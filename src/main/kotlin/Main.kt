fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int, false, true, null, ?:, return)

    // functions, escopo, fluxo if else, retornos, tipos, manipulação de memoria.

    // functions - blocos códigos reutilizaveis | organizar

    // POO - Oriented object Programing

    // DRY - Dont Repeat Yourself = Não faça coisas repetitivas

    // Molde (TEMPLATE)
    // class (molde responsavel por criar N objetos (propriedade))
    val userA = Usuario()
    val userB = Usuario()

    userA.name = "Apolo"
    userB.name = "Thiago"

    userA.printUpperCase()
    userB.printUpperCase()

    userA.updateName("Apolo Wilker")

    userA.printUpperCase()

    val buttonSuccess = `Button.kt`()
    buttonSuccess.text = "Success"
    buttonSuccess.color = "00FF00"

    val buttonCancel = `Button.kt`()
    buttonCancel.text = "Cancelar"
    buttonCancel.color = "FF0000"
}
