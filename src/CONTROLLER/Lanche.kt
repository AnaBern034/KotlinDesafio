package CONTROLLER

import MODEL.Model
import View.InputBebida
import View.InputLanche

class Lanche() : Model(){

    private val lanches = listOf(
        lanche("X-burger", 10.0, listOf("Hambúrgueres", "Queijo mussarela", "Pão de hambúrguer", "Tomate", "Alface")),
        lanche("X-salada", 12.0, listOf("Hambúrgueres", "Queijo mussarela", "Pão de hambúrguer", "Tomate", "Alface", "Ovo"))
    )
    fun listarLanches() {
        println("Escolha um lanche:")
        for ((index, lanche) in lanches.withIndex()) {
            println("${index + 1}. ${lanche.nome} - R$ ${lanche.preco}")
        }
    }
    fun pegarLanche(index: Int): lanche? {
        return if (index in 1..lanches.size) lanches[index - 1] else null
    }

}