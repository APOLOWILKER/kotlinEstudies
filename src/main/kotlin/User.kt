
// class User constructor(var name: String) {

//OPÇÃO 02 - valor padrão
// class User(var name: String = "") {


// OPÇÃO 03 - espera que o construtor receba valor var
class User(var name: String, var isAdmin: Boolean) {
//        var name: String = "" // propriedade
        var cpf: CPF = CPF()

        constructor(name: String) : this(name, false) {
            println("Executei o construtor 2")
        }

        constructor() : this(isAdmin =  false, name = "Desconhecido") {
            println("Execute o contrutor 3")
        }

        //responsabilidade
        fun printUpperCase() {
            println(name.uppercase())
        }
        fun updateName(newName: String) {
            name = "$newName"
            println("Name atualizado")
        }

        fun getNameLength(): Int {
            return name.length
        }

}