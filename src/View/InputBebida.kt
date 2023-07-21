package View

import CONTROLLER.Bebida
import MODEL.Model

open class InputBebida() : Model() {
    // adicionar código
    // fzer o laço
    fun entradaDoUsuario(){
        println("Escolha um tipo de bebida" +
                "\n 1 - REFRIGERANTE" +
                "\n 2 - SUCO" +
                "\n 3 - VOLTAR AO MENU PRINCIPAL")
        var input = readln().toIntOrNull()
        if (input!! <= 3) {
            when (input) {
                1 -> preencherDados(1)
                2 -> preencherDados(2)
                3 -> return
            }
        }else{
            println("Numero inválido digite novamente")
        }
    }

    fun preencherDados(tipo : Int){
        if(tipo.equals(1)){
            println("Digite a quantidade de refrigerante que deseja comprar")
            var quantidadeRefri = readln().toInt()

            val quantidadeAdicionada = bebida("Refrigerante",quantidadeRefri,8.00)
            listaBebida.add(quantidadeAdicionada)


        } else if (tipo.equals(2)){
            println("Digite a quantidade de suco que deseja comprar")
            var quantidadeSuco = readln().toInt()

            val quantidadeAdicionada = bebida("Suco",quantidadeSuco,6.00,)
            listaBebida.add(quantidadeAdicionada)

        } else{
            println("Numero inválido digite novamente")
        }
    }
}

fun main() {
    var entrada = InputBebida()
    entrada.entradaDoUsuario()
    var bebiba = Bebida()
    bebiba.mostrarBebida(entrada)
    bebiba.CalcularQuantidade(entrada)
    bebiba.CalcularPreco(entrada)


}