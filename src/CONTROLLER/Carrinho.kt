package CONTROLLER

import MODEL.Model
import View.InputBebida
import View.InputLanche
import java.util.*

open class Carrinho : Model() {
    var valorTotal = 0.0

    fun calcularTotal(inputBebida: InputBebida,inputLanche: InputLanche){
        var valorBebida = 0.0
        var valorLanche = 0.0

        for (i in inputBebida.listaBebida){
            valorBebida += i.preco!! * i.quantidade!!
        }
        for(i in inputLanche.listaLanche){
            valorLanche += i.preco * i.quantidade!!
        }
        if (inputLanche.listaLanche.isNotEmpty() || inputBebida.listaBebida.isNotEmpty()){
        println("============================")
        println("Valor bebida : $valorBebida")
        println("Valor lanche : $valorLanche")
        valorTotal = valorBebida + valorLanche
        println("==========================")
        println("VALOR TOTAL: $valorTotal")
        }
    }

    fun finalizarPedidos(inputBebida: InputBebida, inputLanche: InputLanche) {
        if (inputLanche.listaLanche.isNotEmpty() || inputBebida.listaBebida.isNotEmpty()) {
            println("Formas de pagamento:")
            println("1. Cartão de crédito")
            println("2. Cartão de débito")
            println("3. Vale refeição")
            println("4. Dinheiro")
            val formaPagamento = readln().toInt()

            when (formaPagamento) {
                1, 2, 3 -> {
                    limparCarinho(inputBebida,inputLanche)
                    println("Compra finalizada com sucesso! Boa refeição!")
                }

                4 -> {
                    println("Digite o valor em dinheiro:")
                    val valorPago = readln().toInt()

                    if (valorPago >= valorTotal) {
                        val troco = valorPago - valorTotal
                        println("Compra finalizada com sucesso! Troco: R$ $troco")
                        limparCarinho(inputBebida,inputLanche)
                    } else {
                        println("Valor insuficiente. Pedido não finalizado.")
                    }
                }

                else -> {
                    println("Opção inválida. Pedido não finalizado.")
                }
            }
        }else{
            println("=================")
            println("Você não tem nada no carrinho")
            println("=================")
            return

        }
    }
    fun limparCarinho(inputBebida: InputBebida,inputLanche: InputLanche){
        println("LIMPANDO DADOS....")
        println()
        inputBebida.listaBebida.clear()
        inputLanche.listaLanche.clear()
        valorTotal = 0.0
    }

}
