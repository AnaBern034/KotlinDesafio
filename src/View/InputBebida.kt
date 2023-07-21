package View

import CONTROLLER.Bebida
import MODEL.Model

open class InputBebida() : Bebida() {
    // adicionar código OK
    // fzer o laço OK

    fun entradaDoUsuario(){
        var resposta = 0
        while (resposta != 2) {
            println(
                "Escolha um tipo de bebida" +
                        "\n 1 - REFRIGERANTE" +
                        "\n 2 - SUCO" +
                        "\n 3 - VOLTAR AO MENU PRINCIPAL"
            )
            var input = readln().toIntOrNull()
            if (input!! <= 3) {
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
                if (resposta > 2){
                    println("Numero inválido, digite novamente")
                    continue
                }

            } else {
                println("Numero inválido, digite novamente")
                continue
            }
        }
    }
    fun editarPedido(inputBebida: InputBebida){
        println("Você deseja 1 - adicionar ou 2 - remover")
        val opção = readln().toInt()
        if (opção < 2) {
            when (opção) {
                1 -> {
                    println("Digite o código do produto")
                    val codigo = readln().toInt()
                    println("Digite a quantidade para adicionar")
                    val quantidade = readln().toInt()
                    adicionaPedido(inputBebida, codigo, quantidade)
                }

                2 -> {
                    println("Digite o código do produto")
                    val codigo = readln().toInt()
                    println("Digite a quantidade para remover")
                    val quantidade = readln().toInt()
                    removerQuantidade(inputBebida, codigo, quantidade)
                }
            }
        }else{ println("Opção inválida") }
    }
}
