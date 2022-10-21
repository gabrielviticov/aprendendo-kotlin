package estruturado.exercicios.ex017

import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan

//Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo.
fun main(){
    var angulo: Double
    var seno: Double
    var cosseno: Double
    var tangente: Double

    print("Informe o angulo que você deseja: ")
    angulo = readln().toDouble()

    seno = Math.sin(Math.toRadians(Math.ceil(angulo)))
    cosseno = Math.cos(Math.toRadians(Math.ceil(angulo)))
    tangente = Math.tan(Math.toRadians(Math.ceil(angulo)))

    println("Temos o SENO de ${"%.2f".format(seno)}")
    println("Temos o COSSENO de ${"%.2f".format(cosseno)}")
    println("Temos a TANGENTE de ${"%.2f".format(tangente)}")
}