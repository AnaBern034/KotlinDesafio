package CONTROLLER

import MODEL.Model

open class Carrinho : Model() {
    private var valorTotal = 0.0
    fun adicionarAoCarrinho(nome: String, preco: Double) {
        println("Digite a quantidade:")
        val quantidade = readln().toInt()
        sacola.add(carrinho(nome, preco, quantidade))
        valorTotal += preco * quantidade
        println("Item adicionado ao carrinho.")
    }
    fun finalizarPedidos() {
        println("Valor total do pedido: R$ $valorTotal")
        if (sacola.isEmpty()) {
            println("Carrinho vazio. Pedido não finalizado.")
            return
        }

        println("Itens do pedido:")
        for ((numero, item) in sacola.withIndex()) {
            println("${numero + 1}. ${item.nome} - R$ ${item.preco} x ${item.quantidade}")
        }

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