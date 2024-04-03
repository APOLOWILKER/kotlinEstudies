// só instancia 1 vez UNICO
// se for reusado ou redeclarado ele vai ser sobrescrito

object DataBase {
    var name: String = "Desconhecido banco"
    var userLogged: User? = null
}