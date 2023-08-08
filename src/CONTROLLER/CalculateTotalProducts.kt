package CONTROLLER

import View.InputBebidaViewer.InputBebida
import View.InputFoodViewer.InputLanche

class CalculateTotalProducts {
    var valorTotal = 0.0

    fun calcularTotal(inputBebida: InputBebida, inputLanche: InputLanche) : Double {
        var valorBebida = 0.0
        var valorLanche = 0.0

        for (i in inputBebida.listaBebida) {
            valorBebida += i.preco!! * i.quantidade!!
        }
        for (i in inputLanche.listaLanche) {
            valorLanche += i.preco * i.quantidade!!
        }
        return valorBebida + valorLanche
    }
}