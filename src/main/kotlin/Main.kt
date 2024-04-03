fun main() {
    // Palavra reservada INIT - Parecido com o construtor
    // serve para inicializar alguma coisa, e
    //  começa sempre depois que o construtor padrão/primário já foi iniciado
    //  ai sim podemos usar o init
    /*
    * Bloco Init: O bloco init é um bloco de inicialização que é executado
    * imediatamente após o construtor primário.
    * Ele é útil quando você precisa executar algum código durante a inicialização
    * que não pode ser feito no construtor primário.
    */

    val userA = User()

    // PROPRIEDADE DE OBJETO
    userA.label = "trocar o texto da label"
    println(userA.label)

    // PROPRIEDADE DE CLASSE

}

// no kotlin tudo é tratado como objeto



// GLOSSARIO (var, val, fun, class, double, string, int, false, true, null, ?:, return)

// functions, escopo, fluxo if else, retornos, tipos, manipulação de memoria.

// functions - blocos códigos reutilizaveis | organizar

// POO - Oriented object Programing

// DRY - Dont Repeat Yourself = Não faça coisas repetitivas

// Molde (TEMPLATE)
// class (molde responsavel por criar N objetos (propriedade))

// CONSTRUTOR - Posso pré Preencher uma propriedade dentro

// SOBRECARGA DE CONSTRUTOR (IGUAL A DE FUNÇÃO)

// classes, objetos, construtor, funçao, propriedades (var, val String, Int, OutroObjeto)