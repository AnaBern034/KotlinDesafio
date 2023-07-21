package CONTROLLER

import MODEL.Model
import View.InputBebida

open class Bebida() : Model(){
    fun CalcularPreco(input: InputBebida){
        var calcular = 0.0
        for (i in input.listaBebida){
            calcular= i.preco!! * i.quantidade!!
            println("Preço total $calcular")
        }
    }
    fun mostrarBebida( input : InputBebida){
       input.listaBebida.forEach(){
            println("Quantidade: ${it.quantidade}")
        }
    }

}