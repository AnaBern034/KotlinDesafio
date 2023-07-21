import CONTROLLER.Bebida
import CONTROLLER.Carrinho
import CONTROLLER.Lanche
import View.InputBebida
import View.InputLanche

fun main() {
    val bebida = InputBebida()
    val lanche = InputLanche()
    val final = Carrinho()
    val bebidaController = Bebida()
    val lancheController = Lanche()
    println("SEJA BEM VINDO AO ATENDIMENTO LANCHONETE")

    while (true) {
        println("Selecione uma opção:" +
                "\n1- Lanche" +
                "\n2- Bebidas" +
                "\n3- Editar Pedido" +
                "\n4- Ver pedido" +
                "\n5- Finalizar")

        val opcao = readln().toInt()

        when (opcao) {
            1 -> lanche.escolherLanche()
            2 ->bebida.entradaDoUsuario()
            3 -> {
                lancheController.mostrarLancheSelecionado(lanche)
                bebidaController.mostrarBebida(bebida)
                final.calcularTotal(bebida,lanche)
                final.finalizarPedidos()
                break
            }
            else -> println("Opção inválida, tente novamente")
        }
    }
}
