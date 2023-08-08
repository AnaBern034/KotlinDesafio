package View.InputFoodViewer

import CONTROLLER.AdicionarPedidos

class ChangeRequestFood {
    val add = AdicionarPedidos()
    fun editarPedido(inputLanche: InputLanche){
        println("Você deseja 1 - adicionar , 2 - remover , 3 - ainda não viu o código??")
        val opção = readln().toInt()
        if (opção <= 3) {
            when (opção) {
                1 -> {
                    println("Digite o código do produto")
                    val codigo = readln().toInt()
                    println("Digite a quantidade para adicionar")
                    val quantidade = readln().toInt()
                    add.addingRequestFood(inputLanche, codigo, quantidade)
                }

                2 -> {
                    println("Digite o código do produto")
                    val codigo = readln().toInt()
                    println("Digite a quantidade para remover")
                    val quantidade = readln().toInt()
                    removerQuantidade(inputLanche, codigo, quantidade)
                }
                3-> {
                    println("PARA VER O CÓDIGO DO PRODUTO, DIGITE A OPÇÃO {VER PEDIDO}")
                    return
                }
            }
        }else{ println("Opção inválida") }
    }
}
}