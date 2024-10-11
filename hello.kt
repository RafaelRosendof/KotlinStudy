data class Figas(val name : String , val age : Int? = null)

fun main(args : Array<String>){
	val figas = listOf(Figas("Rochas"),Figas("Bob", age = 20))

	val veio = figas.maxBy { it.age ?: 0 }

	println("O mais velho é : $veio")

	}


