package BEBIDAS

import MODEL.Product
import View.InputBebidaViewer.InputBebida
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

class TestarBebidaController {
    val entradaUsuario = InputBebida()
    val codigo = 110

    @Test
    fun removerQuantidade(){
        val bebida1 = Product.Drink("Refrigerante",5,10.0,codigo)
        entradaUsuario.listaBebida.add(bebida1)

        entradaUsuario.removerQuantidade(entradaUsuario,codigo,3)
        assertEquals(2,bebida1.quantidade)
    }
    @Test
    fun adicionarQuantidade(){
        val bebida1 = Product.Drink("Refrigerante",10,10.0,codigo)
        entradaUsuario.listaBebida.add(bebida1)

        entradaUsuario.adicionaPedido(entradaUsuario,codigo,2)
        assertEquals(12,bebida1.quantidade)
    }
}