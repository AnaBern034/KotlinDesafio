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
    }



