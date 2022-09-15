package estruturado.exercicios.ex007

//Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros.
fun main(){
    var metros: Double
    var centimetros: Double
    var milimetros: Double

    print("Informe a medida em metros: ")
    metros = readln().toDouble()

    centimetros = metros * 100
    milimetros = metros * 1000

    println("A medida de ${metros} m² equivale à ${centimetros} centimetros e ${milimetros} milimetros")
}