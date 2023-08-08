package MODEL

interface GerarCódigo {
    companion object{
    fun gerarCodigoUnico(): Int { return (Math.random() * 10000).toInt() }
}
}