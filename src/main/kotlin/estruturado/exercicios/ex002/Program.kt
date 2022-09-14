package estruturado.exercicios.ex002

//Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas.
fun main(){
    print("Informe seu nome: ")
    val nome: String? = readLine()
    println("Olá, ${nome}. Prazer te conhecer!")
}