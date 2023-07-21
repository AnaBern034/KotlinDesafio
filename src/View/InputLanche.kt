package View

import CONTROLLER.Carrinho
import CONTROLLER.Lanche


class InputLanche : Carrinho(){
    fun escolherLanche() {
        val lancheMenu = Lanche()
        lancheMenu.listarLanches()

        val opcao = readln().toInt()
        val lanche = lancheMenu.pegarLanche(opcao)

        if (lanche != null) {
            adicionarAoCarrinho(lanche.nome, lanche.preco)
        } else {
            println("Opção inválida, tente novamente")
        }
    }
}
