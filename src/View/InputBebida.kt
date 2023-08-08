package View

import CONTROLLER.InserirDadosParaEscolherOProduto

open class InputBebida() : InserirDadosParaEscolherOProduto() {
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

            if (input != null && input <= 3 && input != 0) {
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
                 resposta = readln().toIntOrNull() ?: 0
                if (resposta != 1 && resposta != 2){
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
        println("Você deseja 1 - adicionar, 2 - remover OU 3 - ainda não viu o código??")
        val opção = readln().toInt()
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
                3 -> {
                    println("PARA VER O CÓDIGO DO PRODUTO, DIGITE A OPÇÃO {VER PEDIDO}")
                    return
                }else -> println("Opção inválida")
            }
        }
    }

