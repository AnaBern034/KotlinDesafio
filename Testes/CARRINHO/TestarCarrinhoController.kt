package CARRINHO

import CONTROLLER.FinalingRequestProduct
import MODEL.Product
import View.InputBebida
import View.InputLanche
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

class TestarCarrinhoController {
    private val carinho = FinalingRequestProduct()
    private val bebida = InputBebida()
    private val lanche = InputLanche()
    @Test
    fun testandoCalcularTotal(){
        bebida.listaBebida.add(Product.Drink("Suco",5,12.0,0))
        lanche.listaLanche.add(Product.Food("X-Salada",20.00,2,0))

        carinho.calcularTotal(bebida,lanche)
        assertEquals(100.0,carinho.valorTotal)
    }
    @Test
    fun testandoLimparCarrinho(){
        bebida.listaBebida.add(Product.Drink("Coca-cola",2,10.0,0))
        lanche.listaLanche.add(Product.Food("X-Salada",20.00,2,0))

        carinho.limparCarinho(bebida,lanche)
        assertEquals(0,bebida.listaBebida.size)
        assertEquals(0,lanche.listaLanche.size)
    }
}

