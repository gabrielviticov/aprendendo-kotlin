package estruturado.exercicios.ex010

import java.util.*

// Faça um programa que leia a largura e a altura de uma parede em metros, calcule a sua área e a quantidade de tinta necessária para pintá-la,
// sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
fun main(){
    val config = Locale.setDefault(Locale.US)
    var altura: Double
    var largura: Double
    var area: Double
    var litros_tinta: Double

    print("Informe a altura da parede: ")
    altura = readln().toDouble()
    print("Informe a largura da parede: ")
    largura = readln().toDouble()

    area = altura * largura
    litros_tinta = area / 2

    println("A parede tem a dimensão de ${"%.1f".format(altura)} x ${"%.1f".format(largura)} e a sua área é de ${area}m²")
    println("Para pintar essa parede inteira, serão necessário ${litros_tinta}l de tinta")
}