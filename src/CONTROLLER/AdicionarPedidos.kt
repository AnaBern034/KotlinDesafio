package CONTROLLER

import MODEL.ListOfClasses
import View.InputBebidaViewer.InputBebida
import View.InputFoodViewer.InputLanche

class AdicionarPedidos : ListOfClasses(){
    fun addingRequestDrink(input: InputBebida, codigo : Int, quantidadeAdicionada : Int ) {
        val produto = listaBebida.find { it.code == codigo }

        if (produto != null) {
            produto.quantidade = produto.quantidade!! + quantidadeAdicionada
            println("Quantidade adicionada, digite em {ver pedidos} para ter a certeza que foi adicionada")
        } else {
            println("Produto não encontrado")
        }
    }
    fun addingRequestFood(input: InputLanche, codigo : Int, quantidadeAdicionada : Int ) {
        val produto = listaLanche.find { it.code == codigo }

        if (produto != null) {
            produto.quantidade = produto.quantidade!! + quantidadeAdicionada
            println("Quantidade adiciona, digite em {ver pedidos} para ter a certeza que foi adicionada")
        } else {
            println("Produto não encontrado")

        }

    }
}
