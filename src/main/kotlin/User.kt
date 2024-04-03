
// class User constructor(var name: String) {

//OPÇÃO 02 - valor padrão
// class User(var name: String = "") {


// OPÇÃO 03 - espera que o construtor receba valor var
class User(var name: String, var isAdmin: Boolean) {
//        var name: String = "" // propriedade
        var cpf: CPF = CPF()

        // constante do length do name
        private val MAX_NAME_LENGTH = 8
        // padrão UPPER_CASE - TODA CONSTANTE TEM LETRA MAIUSCULA
        //  palavra private essa várivel só é visivel dentro do objeto
        //  Até consigo utilizar ela, mas n manipular.

        init {
            println("ola $MAX_NAME_LENGTH")
        }


        // propeidade de objeto
        // var - mutavel
        // val - imutavel
        var label = "$name é admin do sistema $isAdmin"


        /*
        * Em resumo, o construtor primário é usado para inicializar propriedades,
        * o bloco init é usado para executar código de inicialização e
        * os construtores secundários são usados quando você precisa
        * de várias maneiras de inicializar sua classe.
        * ** a ordem é importante, segue de cima para baixo (isso n acontece para os construtores),
        * é improvavel você usar mais de 1 init, mas pode utilizar,
        * o que se chama multi-inicialization.
        */
        init {
            println("Olá $name")
            // geralmente utilizado para inicializar um construtor
            // banco de dados e outros.
        }

        // construtor secundário pois precisa do this
    /*
    *
    * Construtor Secundário: Em Kotlin, você também pode ter um ou mais construtores secundários.
    *  Eles são úteis quando você precisa de mais de uma maneira de inicializar sua classe.
    *  Os construtores secundários precisam delegar para o construtor primário
    * usando a palavra-chave this.
    */
        constructor(name: String) : this(name, false) {
            println("Executei o construtor 2")
        }

        constructor() : this( name = "Desconhecido") {
            println("Execute o construtor 3")
        }

        //responsabilidade
        fun printUpperCase() {
            println(name.uppercase())
        }
        fun updateName(newName: String) {
            if (newName.length > MAX_NAME_LENGTH) {
                // faz o que quiser
            }
            name = "$newName"
            println("Name atualizado")
        }

        fun getNameLength(): Int {
            return name.length
        }

}