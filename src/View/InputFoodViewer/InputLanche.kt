package View.InputFoodViewer

import MODEL.ListOfClasses

class InputLanche : ListOfClasses(){
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
   }



