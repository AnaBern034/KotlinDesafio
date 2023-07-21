package MODEL

import CONTROLLER.Carrinho

open abstract class Model {

      var listaBebida = mutableListOf<bebida>()

     val sacola = mutableListOf<carrinho>()

    data class bebida(var nome : String?, var quantidade : Int?, var preco : Double?)
    data class lanche(val nome: String, val preco: Double, val ingredientes: List<String>)
    data class carrinho(val nome: String, val preco: Double, var quantidade: Int)


//    data class ItemPedido(val nome: String, val preco: Double, var quantidade: Int)
//    data class Bebida(val nome: String, val preco: Double)


    data class Pessoa (var nome : String? )
}