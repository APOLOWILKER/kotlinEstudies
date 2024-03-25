class User constructor(var name: String = "") {
//        var name: String = "" // propriedade
        var cpf: CPF = CPF()

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