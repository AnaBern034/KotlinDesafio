package CONTROLLER

import MODEL.Product
import View.InputBebidaViewer.InputBebida
import View.InputFoodViewer.InputLanche

open class FinalingRequestProduct : Product {
  fun finalizarPedidoComOValorTotal(inputBebida: InputBebida, inputLanche: InputLanche){
      val total = CalculateTotalProducts()
      val valorTotal = total.calcularTotal(inputBebida,inputLanche)
      val pedidoFinalizado = RequestFinalizer(valorTotal)
      pedidoFinalizado.finalizarPedidos(inputBebida,inputLanche)

  }
}
