package CONTROLLER

import View.InputBebidaViewer.InputBebida
import View.InputFoodViewer.InputLanche

class ShowAllProduct {
    fun mostrarBebida( input : InputBebida){
        input.listaBebida.forEach(){
            println("CÓDIGO GERADO: ${it.code}| BEBIDA: ${it.nome} | QUANTIDADE: ${it.quantidade} | PREÇO : ${it.preco}")
        }
    }

    fun mostrarLancheSelecionado(input : InputLanche){
        input.listaLanche.forEach(){
            println("CÓDIGO GERADO: ${it.code}| LANCHE: ${it.nome} | QUANTIDADE: ${it.quantidade} | PREÇO : ${it.preco}")
        }
    }
}
