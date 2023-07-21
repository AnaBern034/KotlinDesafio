package View

import CONTROLLER.Lanche
class InputLanche : Lanche(){
    // adicionar laço OK

    fun escolherLanche() {
            var resposta = 0
            while (resposta != 2) {
                println(
                    "Escolha um tipo de lanche" +
                            "\n 1 - X-BURGUER" +
                            "\n 2 - X-SALADA" +
                            "\n 3 - VOLTAR AO MENU"
                )
                var input = readln().toIntOrNull()
                if ( input !=null && input <= 3 && input != 0) {
                    when (input) {
                        1 -> preencherDados(1)
                        2 -> preencherDados(2)
                        3 -> return
                    }
                    println(
                        "Deseja comprar novamente?" +
                                "\n1-SIM" +
                                "\n2-NÃO"
                    )
                    resposta = readln().toInt()
                    if (resposta != 1 && resposta != 2) {
                        println("Numero inválido, digite novamente")
                        continue
                    }
                } else {
                    println("Numero inválido, digite novamente")
                    continue
                }
            }
        }
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
                    adicionaPedido(inputLanche, codigo, quantidade)
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



