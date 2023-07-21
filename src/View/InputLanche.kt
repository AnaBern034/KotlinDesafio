package View

import CONTROLLER.Lanche
import MODEL.Model

class InputLanche : Model(){
    // adicionar x salada
    var lanchess = Lanche()
    fun escolherTipo(){
        println("Escolha um tipo de lanche para ver os ingredientes" +
                "\n 1 - X-BURGER" +
                "\n 2 - X-SALADA")
        var input = readln().toIntOrNull()
        if (input!! <= 3) {
            when (input) {
                1 -> {  println(ingredientesXBurguer)
                        ingredientesXBurger()
                }

             //   2 -> ingredientesXSalada()
                3 -> return
            }
        }else{
            println("Numero inválido digite novamente")
        }
    }
    fun ingredientesXBurger(){

        println("Digite a quantidade de lanches")
        var quantidade = readln().toInt()

        for (i in 0 until quantidade) {
            println(
                "Deseja adicionar um item do lanche $i" +
                        "\n sim" +
                        "\n não"
            )
            var input = readln().toString()
            if (input.equals("sim")) {
                println(
                    "Ingredientes para adicionar " +
                            "\n 1 - $one" +
                            "\n 2 - $two" +
                            "\n 3 - $three"
                )
                println("Qual item deseja adicionar? ")
                var item = readln().toInt()
                    when(item) {
                        1 -> ingredientesAdd.add(one)
                        2 -> ingredientesAdd.add(two)
                        3-> ingredientesAdd.add(three)
                        else -> println("Opção inválida")
                    }

                val adicionarItemEQuantidade = lanche("X-Burguer",quantidade,10.00,ingredientesAdd)
                listaLanche.add(adicionarItemEQuantidade)

            } else if (input.equals("não")) {
                val itemNaoAdd = lanche("X-Burguer",quantidade,10.00, emptyList())
                listaLanche.add(itemNaoAdd)
            } else {
                println("Opção Inválida")
            }
        }
    }
}


fun main() {
    val ver = InputLanche()
    val mostrar = Lanche()
    ver.escolherTipo()
    mostrar.mostrarLacheADD(ver)

}