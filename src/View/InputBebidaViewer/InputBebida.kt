package View.InputBebidaViewer

import CONTROLLER.AdicionarPedidos
import CONTROLLER.InserirDadosParaEscolherOProduto
import MODEL.ListOfClasses

open class InputBebida() : ListOfClasses() {
  val dados = InserirDadosParaEscolherOProduto()
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
                    1 -> dados.preencherDadosBebidas(1)
                    2 -> dados.preencherDadosBebidas(2)
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
}

