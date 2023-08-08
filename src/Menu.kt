import CONTROLLER.CalculateTotalProductsAndFinalizeRequest
import CONTROLLER.ShowAllProduct
import View.InputBebidaViewer.ChangeRequestDrink
import View.InputBebidaViewer.InputBebida
import View.InputFoodViewer.ChangeRequestFood
import View.InputFoodViewer.InputLanche
import java.lang.NumberFormatException
import kotlin.system.exitProcess

fun main() {
    val bebida = InputBebida()
    val lanche = InputLanche()
    val mostrarPedido = ShowAllProduct()
    val mudarPedidoBebida = ChangeRequestDrink()
    val mudarPedidoLanche = ChangeRequestFood()
    val finalizarPedido = CalculateTotalProductsAndFinalizeRequest()





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
                    "\n7 - Sair"
        )
        try {
        val opcao = readln().toInt()

        when (opcao) {
            1 -> bebida.escolherBebida()
            2 -> lanche.escolherLanche()
            3 -> {
                mostrarPedido.mostrarBebida(bebida)
                mostrarPedido.mostrarLanche(lanche)
            }

            4-> mudarPedidoBebida.editarPedido(bebida)
            5-> mudarPedidoLanche.editarPedido(lanche)
            6 ->{
                finalizarPedido.calcularTotal(bebida,lanche)
                finalizarPedido.finalizarPedidos(bebida,lanche)
            }
            7-> exitProcess(0)

            else -> println("Opção inválida, tente novamente")
        }
    } catch (e : NumberFormatException){
            println("Opção inválida, Digite um número válido")
        }
    }
}

