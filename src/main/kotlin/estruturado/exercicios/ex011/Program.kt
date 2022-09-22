package estruturado.exercicios.ex011

import java.util.*

//Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.
fun main(){
    val config = Locale.setDefault(Locale.US)
    var preco: Double
    var novo: Double
    print("Informe o preço do produto R$")
    preco = readln().toDouble()

    novo = preco - (preco * 5)/100

    println("O produto que antes custava R$${"%.2f".format(preco)}, hoje na promoção vai custar R$${"%.2f".format(novo)}")
}