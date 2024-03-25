class Usuario {
    var name: String = "" // propriedade

    //responsabilidade
    fun printUpperCase() {
        println(name.uppercase())
    }
    fun updateName(newName: String) {
        name = "$newName atualizado com sucesso"
    }
}