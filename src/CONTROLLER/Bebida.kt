package CONTROLLER

import MODEL.Model
import View.InputBebida


open class Bebida() : Model(){
    fun mostrarBebida( input : InputBebida){
       input.listaBebida.forEach(){
           println("CÓDIGO GERADO: ${it.code}| BEBIDA: ${it.nome} | QUANTIDADE: ${it.quantidade} | PREÇO : ${it.preco}")
        }
    }
    fun preencherDados(tipo : Int){
        var resposta = 0
        while (resposta != 2){
            if (tipo.equals(1)) {
                println("Digite a quantidade de refrigerante que deseja comprar")
                var quantidadeRefri = readln().toInt()

                if (quantidadeRefri != null && quantidadeRefri != 0) {
                    val quantidadeAdicionada = bebida("Refrigerante", quantidadeRefri, 8.00, gerarCodigoUnico())
                    listaBebida.add(quantidadeAdicionada)
                }else{
                    println("Opção inválida, Digite novamente")
                    continue
                }
                return

            } else if (tipo.equals(2)) {
                println("Digite a quantidade de suco que deseja comprar")
                var quantidadeSuco = readln().toInt()

                if (quantidadeSuco != null && quantidadeSuco != 0) {
                val quantidadeAdicionada = bebida("Suco", quantidadeSuco, 6.00,gerarCodigoUnico())
                listaBebida.add(quantidadeAdicionada)
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
        return (Math.random() * 10000).toInt()
    }
    fun removerQuantidade(input: InputBebida, codigo : Int, quantidadeRemove : Int ){
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

    fun adicionaPedido(input: InputBebida, codigo : Int, quantidadeAdicionada : Int ) {
        val produto = listaBebida.find { it.code == codigo }

        if (produto != null) {
            produto.quantidade = produto.quantidade!! + quantidadeAdicionada
            println("Quantidade adicionada, digite em {ver pedidos} para ter a certeza que foi adicionada")
        } else {
            println("Produto não encontrado")

        }

    }
}
