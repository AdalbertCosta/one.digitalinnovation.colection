package one.digitalinnovation.colections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Clarice"
    nomes[2] = "Costa"

    for (nome in nomes) {
        println(nome)
    }

    println("----------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("----------------------")
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}