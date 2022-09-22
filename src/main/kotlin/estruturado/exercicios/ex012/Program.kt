package estruturado.exercicios.ex012

import java.util.Locale

//Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento.
fun main(){
    val config = Locale.setDefault(Locale.US)
    var salario: Double
    var novo: Double

    print("Informe o salário do funcionário R$")
    salario = readln().toDouble()

    novo = salario + (salario * 15)/100

    println("O funcionário que antes recebia R$${"%.2f".format(salario)}, passa a receber hoje, R$${"%.2f".format(novo)}")
}