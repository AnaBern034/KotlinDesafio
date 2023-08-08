package CONTROLLER

import View.InputBebida
import View.InputLanche

class CalculateTotalProducts {
    var valorTotal = 0.0
    fun calcularTotal(inputBebida: InputBebida, inputLanche: InputLanche){
        var valorBebida = 0.0
        var valorLanche = 0.0

        for (i in inputBebida.listaBebida){
            valorBebida += i.preco!! * i.quantidade!!
        }
        for(i in inputLanche.listaLanche){
            valorLanche += i.preco * i.quantidade!!
        }
        if (inputLanche.listaLanche.isNotEmpty() || inputBebida.listaBebida.isNotEmpty()){
            println("============================")
            println("Valor bebida : $valorBebida")
            println("Valor lanche : $valorLanche")
            valorTotal = valorBebida + valorLanche
            println("==========================")
            println("VALOR TOTAL: $valorTotal")
        }
    }

}