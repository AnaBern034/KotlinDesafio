package LANCHES

import MODEL.Model
import View.InputLanche
import org.testng.AssertJUnit
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

class TestarLancheController {
    val entradaUsuario = InputLanche()
    val codigo = 110
    @Test
    fun removerQuantidade(){
        val lanche1 = Model.lanche("X-BURGUES",5.0,5,codigo)
        entradaUsuario.listaLanche.add(lanche1)

        entradaUsuario.removerQuantidade(entradaUsuario,codigo,3)
       assertEquals(2, lanche1.quantidade)
    }
    @Test
    fun adicionarQuantidade(){
        val lanche2 = Model.lanche("X-SALADA",9.8,15,codigo)
        entradaUsuario.listaLanche.add(lanche2)

        entradaUsuario.adicionaPedido(entradaUsuario,codigo,5)
       assertEquals(20, lanche2.quantidade)
    }
}