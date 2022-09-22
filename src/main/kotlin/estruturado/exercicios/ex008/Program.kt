package estruturado.exercicios.ex008

// Faça um programa que leia um número Inteiro qualquer e mostre na tela a sua tabuada.
fun main(){
    var num: Int
    print("Informe um número para ver a sua tabuada: ")
    num = readln().toInt()

    println("${num} x ${1} = ${num*1}")
    println("${num} x ${2} = ${num*2}")
    println("${num} x ${3} = ${num*3}")
    println("${num} x ${4} = ${num*4}")
    println("${num} x ${5} = ${num*5}")
    println("${num} x ${6} = ${num*6}")
    println("${num} x ${7} = ${num*7}")
    println("${num} x ${8} = ${num*8}")
    println("${num} x ${9} = ${num*9}")
    println("${num} x ${10} = ${num*10}")

}