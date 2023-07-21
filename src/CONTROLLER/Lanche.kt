package CONTROLLER

import MODEL.Model
import View.InputBebida
import View.InputLanche

class Lanche() : Model(){
    fun CalcularQuantidade(input: InputBebida){
        var calcular = 0

        for (i in input.listaLanche){
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
        for (i in input.listaLanche){
            calcular= i.preco!! * i.quantidade!!
            println("Preço total $calcular")
        }
    }
    fun mostrarLacheADD( input : InputLanche) {
        if (listaLanche.isEmpty()) {
            println("Nenhum lanche adicionado ")
            return
        }
        listaLanche.forEachIndexed { index, lanche ->
            println("Lanche ${index + 1}: ${lanche.nome}, Quantidade: ${lanche.quantidade}, Preço: ${lanche.preco}")
            if (lanche.ingredinetes.isNotEmpty()) {
                println("Ingredientes adicionados:")
                lanche.ingredinetes.forEachIndexed { i, ingrediente ->
                    println("${i + 1}. $ingrediente")
                }
            }
        }
    }
}