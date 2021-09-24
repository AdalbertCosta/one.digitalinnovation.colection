package one.digitalinnovation.colections

fun main() {
    val salarios = doubleArrayOf(2000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }


    println("---------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salárial é: ${salarios.average()}")

    val salariosMaior2500 = salarios.filter { it > 2500.0}
    println("---------------")
    salariosMaior2500.forEach{println(it)}

    println("---------------")
    println(salarios.count{it in 2200.00..5000.0})

    println("---------------")
    println(salarios.find{it == 2000.00})

    println("---------------")
    println(salarios.find{it == 2500.00})

    println("---------------")
    println(salarios.any{it == 2000.00})
    println(salarios.any{it == 500.00})


}