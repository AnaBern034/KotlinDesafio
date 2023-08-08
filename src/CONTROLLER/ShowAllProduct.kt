package CONTROLLER

import View.InputBebidaViewer.InputBebida
import View.InputFoodViewer.InputLanche

class ShowAllProduct {
    fun mostrarBebida( input : InputBebida){
        if (input.listaBebida.isNotEmpty()){
        input.listaBebida.forEach(){
            println("CÓDIGO GERADO: ${it.code}| BEBIDA: ${it.nome} | QUANTIDADE: ${it.quantidade} | PREÇO : ${it.preco}")
        }
        }else{
            println("Lista vazia")
        }
    }
    fun mostrarLanche(input : InputLanche){
        input.listaLanche.forEach(){
            println("CÓDIGO GERADO: ${it.code}| LANCHE: ${it.nome} | QUANTIDADE: ${it.quantidade} | PREÇO : ${it.preco}")
        }
    }
}
