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
    fun

}