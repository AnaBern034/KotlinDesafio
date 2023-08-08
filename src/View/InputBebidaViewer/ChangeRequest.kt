package View.InputBebidaViewer

import CONTROLLER.AdicionarPedidos

class ChangeRequest {
    val adicionar = AdicionarPedidos()
    fun editarPedido(inputBebida: InputBebida){
        println("Você deseja 1 - adicionar, 2 - remover OU 3 - ainda não viu o código??")
        val opção = readln().toInt()
        when (opção) {
            1 -> {
                println("Digite o código do produto")
                val codigo = readln().toInt()
                println("Digite a quantidade para adicionar")
                val quantidade = readln().toInt()
                adicionar.addingRequestDrink(inputBebida, codigo, quantidade)
            }

            2 -> {
                println("Digite o código do produto")
                val codigo = readln().toInt()
                println("Digite a quantidade para remover")
                val quantidade = readln().toInt()
                adicionar.addingRequestDrink(inputBebida, codigo, quantidade)
            }
            3 -> {
                println("PARA VER O CÓDIGO DO PRODUTO, DIGITE A OPÇÃO {VER PEDIDO}")
                return
            }else -> println("Opção inválida")
        }
    }
}
}