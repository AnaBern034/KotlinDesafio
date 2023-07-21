import CONTROLLER.Bebida
import CONTROLLER.Carrinho
import CONTROLLER.Lanche
import View.InputBebida
import View.InputLanche
import java.lang.NumberFormatException
import kotlin.system.exitProcess

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
                    "\n1- Pedir Bebidas" +
                    "\n2- Pedir Lanche" +
                    "\n3- Ver pedido" +
                    "\n4- Editar Pedido (BEBIDAS)" +
                    "\n5- Editar pedido (LANCHES)" +
                    "\n6- Finalizar" +
                    "\n7- Limpar dados" +
                    "\n8 - Sair"
        )
        try {
        val opcao = readln().toInt()

        when (opcao) {
            1 -> bebida.entradaDoUsuario()
            2 -> lanche.escolherLanche()
            3 -> {
                bebidaController.mostrarBebida(bebida)
                lancheController.mostrarLancheSelecionado(lanche)
            }

            4-> bebida.editarPedido(bebida)
            5-> lanche.editarPedido(lanche)
            6 -> {
                final.calcularTotal(bebida, lanche)
                final.finalizarPedidos(bebida,lanche)
            }
            7-> final.limparCarinho(bebida,lanche)
            8-> exitProcess(0)

            else -> println("Opção inválida, tente novamente")
        }
    } catch (e : NumberFormatException){
            println("Opção inválida, Digite um número válido")

        }
    }
}

