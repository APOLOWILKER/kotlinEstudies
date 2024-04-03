import javax.xml.crypto.Data

fun main() {
    // OBJETOS ÚNICOS - QUERO APENAS 1 OBJ VIVO EX: Banco de Dados / sistema de login
    // Padrão único (Singleton) - para criar instancia única crio com
    val userA = User("Apolo")
    println(DataBase.name)
    println(DataBase.userLogged?.name)
    login(userA)

    println(DataBase.userLogged?.name)

    if (Constants.MAX_NAME_LENGTH > 10) {
        // faz alguma coisa
    }

    // classe -> é o molde para criar N objetos
    // objetos -> é o conjunto de prop. e comportamentos de 1 contexto do sistema
    // object -> é um objeto também, só que ele é unico, ou seja, nao é igual a classe que sai varios objetos
    // exemplos : Banco de dados, Sessão de usuário, Logs

}

fun login(user: User) {
    DataBase.userLogged = user
}

// no kotlin tudo é tratado como objeto

// TODOS object SÃO OBJETOS ÚNICOS (SINGLETON) NÃO EXISTE OUTRA INSTANCIA DESSE OBJ VIVO NA APLICAÇÃO
object Constants {
    // Aqui é unico e serve para agrupamento de constantes
    const val MAX_NAME_LENGTH = 8
    const val DOMAIN = "https://exemplo.com"
}



// GLOSSARIO (var, val, fun, class, double, string, int, false, true, null, ?:, return,
// constructor, init, private, companion object, object)

// functions, escopo, fluxo if else, retornos, tipos, manipulação de memoria.

// functions - blocos códigos reutilizaveis | organizar

// POO - Oriented object Programing

// DRY - Dont Repeat Yourself = Não faça coisas repetitivas

// Molde (TEMPLATE)
// class (molde responsavel por criar N objetos (propriedade))

// CONSTRUTOR - Posso pré Preencher uma propriedade dentro

// SOBRECARGA DE CONSTRUTOR (IGUAL A DE FUNÇÃO)

// classes, objetos, construtor, funçao, propriedades (var, val String, Int, OutroObjeto, private)