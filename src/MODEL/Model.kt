package MODEL

import CONTROLLER.Carrinho
import java.util.UUID

open abstract class Model {

    var listaBebida = mutableListOf<bebida>()
    var listaLanche = mutableListOf<lanche>()

    data class bebida(var nome: String?, var quantidade: Int?, var preco: Double?,val code : Int )
    data class lanche(val nome: String, val preco: Double, var quantidade: Int?, val code : Int)

}