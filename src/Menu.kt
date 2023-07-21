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
        println(
            "Selecione uma opção:" +
                    "\n1- Pedir Lanche" +
                    "\n2- Pedir Bebidas" +
                    "\n3- Ver pedido" +
                    "\n4- Editar Pedido (BEBIDAS)" +
                    "\n5- Editar pedido (LANCHES)" +
                    "\n6- Finalizar"
        )

        val opcao = readln().toInt()

        when (opcao) {
            1 -> lanche.escolherLanche()
            2 -> bebida.entradaDoUsuario()
            3 -> {
                bebidaController.mostrarBebida(bebida)
                lancheController.mostrarLancheSelecionado(lanche)
            }

            4-> bebida.editarPedido(bebida)
            5-> lanche.editarPedido(lanche)
            6 -> {
                final.calcularTotal(bebida, lanche)
                final.finalizarPedidos()
                break
            }

            else -> println("Opção inválida, tente novamente")
        }
    }
}

