fun main() {

    // GLOSSARIO (var, val, fun, class, double, string, int)
    var product = "macbook"

    val price = 9100.90

    val age = 30

    product = "iphone"

    println("Você que um $product ?")
    println("Sabia que o valor de um $product é $ $price")
    println(price::class)
    println(age::class)
    println(product::class)
}
