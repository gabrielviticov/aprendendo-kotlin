package estruturado.exercicios.ex006

import java.util.*

//Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.
fun main(){
    val config = Locale.setDefault(Locale.US)
    val n1: Double
    val n2: Double
    val media: Double

    print("Informe a primeira nota: ")
    n1 = readln().toDouble()
    print("Informe a segunda nota: ")
    n2 = readln().toDouble()

    media = (n1 + n2)/2

    println("Com as notas ${n1} e ${n2}, você obteve uma média de ${"%.2f".format(media)}")
}