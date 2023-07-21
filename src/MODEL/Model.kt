package MODEL

 open abstract class Model {
    companion object {
       val one = "Ovo"
       val two = "Batata palha"
       val three = "Carne de porco"
       var ingredientesXBurguer: List<String> = listOf("Hambúrgueres", "Queijo mussarela", "Pão de hambúrguer", "Tomate", "Alface")
    }
      var listaBebida = mutableListOf<bebida>()
      var listaLanche= mutableListOf<lanche>()
      var ingredientesAdd= mutableListOf<String>()
    data class bebida(var nome : String?, var quantidade : Int?, var preco : Double?)
    data class lanche(var nome : String?, var quantidade : Int?, var preco : Double?, var ingredinetes: List<String>)
    data class Pessoa (var nome : String? )
}