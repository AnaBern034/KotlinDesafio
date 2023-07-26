package CARRINHO

import CONTROLLER.Carrinho
import MODEL.Model
import View.InputBebida
import View.InputLanche
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

class TestarCarrinhoController {
    private val carinho = Carrinho()
    private val bebida = InputBebida()
    private val lanche = InputLanche()
    @Test
    fun testandoCalcularTotal(){
        bebida.listaBebida.add(Model.bebida("Suco",5,12.0,0))
        lanche.listaLanche.add(Model.lanche("X-Salada",20.00,2,0))

        carinho.calcularTotal(bebida,lanche)
        assertEquals(100.0,carinho.valorTotal)
    }
    @Test
    fun testandoLimparCarrinho(){
        bebida.listaBebida.add(Model.bebida("Coca-cola",2,10.0,0))
        lanche.listaLanche.add(Model.lanche("X-Salada",20.00,2,0))

        carinho.limparCarinho(bebida,lanche)
        assertEquals(0,bebida.listaBebida.size)
        assertEquals(0,lanche.listaLanche.size)
    }
}

