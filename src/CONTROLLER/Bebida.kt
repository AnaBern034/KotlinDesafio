package CONTROLLER

import MODEL.Model
import View.InputBebida

open class Bebida() : Model(){
    fun CalcularQuantidade(input: InputBebida){
        var calcular = 0

        for (i in input.listaBebida){
              if ( i.quantidade != null) {
                  calcular += i.quantidade!!
                  println("A quantidade ao total é $calcular")
              } else{
                  println("Esse numero precisa ser válido, digite novamente")
              }
            }
        }
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