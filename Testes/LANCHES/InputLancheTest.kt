package LANCHES

import MODEL.Product
import View.InputFoodViewer.InputLanche
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class InputLancheTest {
    @Test
    fun testEditarPedidoAdicionar() {
        val inputStream = "1\n1000\n2\n".byteInputStream()
        System.setIn(inputStream)

        val lanche1 = Product.Food("X-BURGUER", 10.0, 2, 1000)
        val inputLanche = InputLanche()
        inputLanche.listaLanche.add(lanche1)

        val outPutStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outPutStream))

        inputLanche.editarPedido(inputLanche)

        assertEquals(4, lanche1.quantidade)
    }

    @Test
    fun testEditarPedidoRemover() {
        val inputStream = "2\n1000\n2\n".byteInputStream()
        System.setIn(inputStream)

        val lanche1 = Product.Food("X-BURGUER", 10.0, 5, 1000)
        val inputLanche = InputLanche()
        inputLanche.listaLanche.add(lanche1)

        val outPutStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outPutStream))

        inputLanche.editarPedido(inputLanche)

        assertEquals(3, lanche1.quantidade)
    }
}
