package CONTROLLER

import MODEL.Model
import View.InputBebida
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

                if (quantidadeLanche != null && quantidadeLanche != 0){

                val quantidadeAdicionada = lanche("X-BURGUES",10.0,quantidadeLanche,gerarCodigoUnico())
                listaLanche.add(quantidadeAdicionada)
                } else{
                    println("Opção inválida, Digite novamente")
                    continue
                }
                return
            } else if (tipo.equals(2)) {
                println("Digite a quantidade de lanche que deseja comprar")
                var quantidadeDoOutroLanche = readln().toInt()

                if (quantidadeDoOutroLanche != null && quantidadeDoOutroLanche != 0) {
                    val quantidadeAdicionada = lanche("X-SALADA", 12.0, quantidadeDoOutroLanche, gerarCodigoUnico())
                    listaLanche.add(quantidadeAdicionada)
                }else{
                    println("Opção inválida, Digite novamente")
                    continue
                }
                return
            } else {
                println("Numero inválido digite novamente")
                continue
            }
        }
    }
    fun gerarCodigoUnico(): Int {
        return (Math.random() * 10000).toInt() }
    fun removerQuantidade(input: InputLanche, codigo : Int, quantidadeRemove : Int ){
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
    fun adicionaPedido(input: InputLanche, codigo : Int, quantidadeAdicionada : Int ) {
        val produto = listaLanche.find { it.code == codigo }

        if (produto != null) {
                produto.quantidade = produto.quantidade!! + quantidadeAdicionada
                println("Quantidade adiciona, digite em {ver pedidos} para ter a certeza que foi removida")
            } else {
                println("Produto não encontrado")

            }

        }
    }

