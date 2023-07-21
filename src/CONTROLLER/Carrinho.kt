package CONTROLLER

import MODEL.Model
import View.InputBebida
import View.InputLanche
import java.util.*

open class Carrinho : Model() {
    private var valorTotal = 0.0

    fun calcularTotal(inputBebida: InputBebida,inputLanche: InputLanche){
        var valorBebida = 0.0
        var valorLanche = 0.0

        for (i in inputBebida.listaBebida){
            valorBebida= i.preco!! * i.quantidade!!
            println("Preço total de Bebidas $valorBebida")
        }
        for(i in inputLanche.listaLanche){
            valorLanche = i.preco * i.quantidade!!
            println("Preço total de lanches $valorLanche")
        }
        valorTotal = valorBebida + valorLanche
        println("VALOR TOTAL: $valorTotal")
    }

    fun finalizarPedidos() {
        println("Formas de pagamento:")
        println("1. Cartão de crédito")
        println("2. Cartão de débito")
        println("3. Vale refeição")
        println("4. Dinheiro")
        val formaPagamento = readln().toInt()

        when (formaPagamento) {
            1, 2, 3 -> {
                println("Compra finalizada com sucesso! Boa refeição!")
            }
            4 -> {
                println("Digite o valor em dinheiro:")
                val valorPago = readln().toInt()

                if (valorPago >= valorTotal) {
                    val troco = valorPago - valorTotal
                    println("Compra finalizada com sucesso! Troco: R$ $troco")
                } else {
                    println("Valor insuficiente. Pedido não finalizado.")
                }
            }
            else -> {
                println("Opção inválida. Pedido não finalizado.")
            }
        }
    }

}