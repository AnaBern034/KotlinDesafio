package MODEL

import View.InputBebidaViewer.InputBebida
import View.InputFoodViewer.InputLanche

interface CleanCart {
  companion object {
      fun limparCarinho(inputBebida: InputBebida, inputLanche: InputLanche) {
          println("LIMPANDO DADOS....")
          println()
          inputBebida.listaBebida.clear()
          inputLanche.listaLanche.clear()
      }
  }
}