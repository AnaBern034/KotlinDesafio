package CONTROLLER

import MODEL.CleanCart
import View.InputBebidaViewer.InputBebida
import View.InputFoodViewer.InputLanche

class RequestFinalizer(private val valorTotal : Double) {
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
                    CleanCart.limparCarinho(inputBebida,inputLanche)
                    println("Compra finalizada com sucesso! Boa refeição!")
                }

                4 -> {
                    println("Digite o valor em dinheiro:")
                    val valorPago = readln().toInt()

                    if (valorPago >= valorTotal) {
                        val troco = valorPago - valorTotal
                        println("Compra finalizada com sucesso! Troco: R$ $troco")
                        CleanCart.limparCarinho(inputBebida,inputLanche)
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
}