package CONTROLLER

import MODEL.ListOfClasses
import View.InputBebidaViewer.InputBebida
import View.InputFoodViewer.InputLanche

class RemoverQuantidadesProduto : ListOfClasses() {
    fun removeAmoutDrink(input: InputBebida, codigo : Int, quantidadeRemove : Int ){
        val produto = listaBebida.find { it.code == codigo }

        if (produto != null) {
            if (quantidadeRemove <= produto.quantidade!!){
                produto.quantidade = produto.quantidade?.minus(quantidadeRemove)
                println("Quantidade removida, digite em {ver produtos} para ter a certeza que foi removida")
            }else{
                println("QUANTIDADE : ${produto.quantidade}, Digite uma quantidade válida para remover")
            }
        } else {
            println("Produto não encontrado")

        }

    }
    fun removeAmoutFood(input: InputLanche, codigo : Int, quantidadeRemove : Int ){
        val produto = listaLanche.find { it.code == codigo }

        if (produto != null) {
            if (quantidadeRemove <= produto.quantidade!!){
                produto.quantidade = produto.quantidade?.minus(quantidadeRemove)
                println("Quantidade removida, digite em {ver produtos} para ter a certeza que foi removida")
            }else{
                println("QUANTIDADE : ${produto.quantidade}, Digite uma quantidade válida para remover")
            }
        } else {
            println("Produto não encontrado")

        }

    }

}