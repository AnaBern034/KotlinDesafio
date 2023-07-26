package BEBIDAS

import MODEL.Model
import View.InputBebida
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class InputBebidaTest {
    @Test
    fun testEditarPedidoAdicionar() {
        val inputStream = "1\n1000\n2\n".byteInputStream()
        System.setIn(inputStream)

        val bebida1 = Model.bebida("Refrigerante", 10, 8.0, 1000)
        val inputBebida = InputBebida()
        inputBebida.listaBebida.add(bebida1)

        val outPutStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outPutStream))

        inputBebida.editarPedido(inputBebida)

        assertEquals(12, bebida1.quantidade)
    }
    @Test
    fun testEditarPedidoRemover() {
        val inputStream = "2\n1000\n2\n".byteInputStream()
        System.setIn(inputStream)

        val bebida1 = Model.bebida("Refrigerante", 10, 8.0, 1000)
        val inputBebida = InputBebida()
        inputBebida.listaBebida.add(bebida1)

        val outPutStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outPutStream))

        inputBebida.editarPedido(inputBebida)

        assertEquals(8, bebida1.quantidade)
    }
}