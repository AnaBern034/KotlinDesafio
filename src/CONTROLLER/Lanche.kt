package CONTROLLER

import MODEL.Model
import View.InputLanche
import java.util.*


open class Lanche() : Model(){
    fun mostrarLancheSelecionado(input : InputLanche){
        input.listaLanche.forEach(){
            println("CÓDIGO GERADO: ${it.code}| LANCHE: ${it.nome} | QUANTIDADE: ${it.quantidade} | PREÇO : ${it.preco}")
        }
    }
    fun preencherDados(tipo : Int){
        var resposta = 0
        while (resposta != 2){
            if (tipo.equals(1)) {
                println("Digite a quantidade de lanches que deseja comprar")
                var quantidadeLanche = readln().toInt()

                val quantidadeAdicionada = lanche("X-BURGUES",10.0,quantidadeLanche,gerarCodigoUnico())
                listaLanche.add(quantidadeAdicionada)
                return
            } else if (tipo.equals(2)) {
                println("Digite a quantidade de lanche que deseja comprar")
                var quantidadeDoOutroLanche = readln().toInt()

                val quantidadeAdicionada = lanche("X-SALADA",12.0,quantidadeDoOutroLanche, gerarCodigoUnico())
                listaLanche.add(quantidadeAdicionada)
                return
            } else {
                println("Numero inválido digite novamente")
                continue
            }
        }
    }
    fun gerarCodigoUnico(): Int {
        return (Math.random() * 10000).toInt()
    }
}