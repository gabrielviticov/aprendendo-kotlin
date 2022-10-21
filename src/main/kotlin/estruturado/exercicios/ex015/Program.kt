package estruturado.exercicios.ex015

import kotlin.math.truncate

// Crie um programa que leia um número Real qualquer pelo teclado e mostre na tela a sua porção Inteira.

fun main(){
    val num: Float

    print("Informe um número real: ")
    num = readln().toFloat()

    val porc_num: Int = truncate(num).toInt()
    println("A porção inteira do número ${num} é ${porc_num}")
}