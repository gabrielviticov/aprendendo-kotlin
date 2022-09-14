package estruturado.exercicios.ex003

//Crie um programa que leia dois números e mostre a soma entre eles.
fun main(){
    print("Informe o primeiro número [inteiro]: ")
    val n1: Int = readln().toInt()
    print("Informe o segundo número [inteiro]: ")
    val n2: Int = readln().toInt()

    val soma: Int = n1 + n2

    println("A soma entre ${n1} + ${n2} = ${soma}")
}