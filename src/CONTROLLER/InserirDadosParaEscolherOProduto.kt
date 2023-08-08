package CONTROLLER

import MODEL.Product
import MODEL.GerarCódigo
import MODEL.ListOfClasses

open class InserirDadosParaEscolherOProduto() : ListOfClasses(){
    fun preencherDadosBebidas(tipo : Int){
        var resposta = 0
        while (resposta != 2){
            if (tipo.equals(1)) {
                println("Digite a quantidade de refrigerante que deseja comprar")
                var quantidadeRefri = readln().toInt()

                if (quantidadeRefri != null && quantidadeRefri != 0) {
                    val quantidadeAdicionada = Product.Drink("Refrigerante", quantidadeRefri, 8.00,GerarCódigo.gerarCodigoUnico())
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
                val quantidadeAdicionada = Product.Drink("Suco", quantidadeSuco, 6.00,GerarCódigo.gerarCodigoUnico())
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
    fun preencherDadosLanche(tipo : Int){
        var resposta = 0
        while (resposta != 2){
            if (tipo.equals(1)) {
                println("Digite a quantidade de lanches que deseja comprar")
                var quantidadeLanche = readln().toInt()

                if (quantidadeLanche != null && quantidadeLanche != 0){

                    val quantidadeAdicionada = Product.Food("X-BURGUES",10.0,quantidadeLanche,GerarCódigo.gerarCodigoUnico())
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
                    val quantidadeAdicionada = Product.Food("X-SALADA", 12.0, quantidadeDoOutroLanche,GerarCódigo.gerarCodigoUnico())
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
}
