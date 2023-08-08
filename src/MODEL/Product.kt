package MODEL

open abstract class Product {
    data class Drink(var nome: String?, var quantidade: Int?, var preco: Double?, val code : Int )
    data class Food(val nome: String, val preco: Double, var quantidade: Int?, val code : Int)

}