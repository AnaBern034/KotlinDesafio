package MODEL

interface CreateCode {
    companion object{
    fun gerarCodigoUnico(): Int { return (Math.random() * 10000).toInt() }
}
}