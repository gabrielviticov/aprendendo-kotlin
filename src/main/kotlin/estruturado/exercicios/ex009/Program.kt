package estruturado.exercicios.ex009

import java.util.*

// Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ela pode comprar.
fun main(){
    val config = Locale.setDefault(Locale.US)
    var reais: Double
    var dolar: Double

    print("Quantos reais você possui? R$")
    reais = readln().toDouble()

    dolar = reais / 5.28

    println("Com R$${"%.2f".format(reais)} você pode comprar até U$${"%.2f".format(dolar)}")
}