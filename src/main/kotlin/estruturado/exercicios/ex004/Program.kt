package estruturado.exercicios.ex004

//Faça um programa que leia um número Inteiro e mostre na tela o seu sucessor e seu antecessor.
fun main(){
    val num: Int
    val ant: Int
    val suc: Int

    print("Informe um número [inteiro]: ")
    num = readln().toInt()
    ant = num - 1
    suc = num + 1

    println("Analisando o valor ${num}\nSeu antecessor é ${ant}\nSeu sucessor é ${suc}")
}