package estruturado.exercicios.ex013

//Escreva um programa que converta uma temperatura digitando em graus Celsius e converta para graus Fahrenheit.
fun main(){
    val temp: Float
    val fahrenheit: Float

    print("Informe a temperatura em ºC: ")
    temp = readln().toFloat()

    fahrenheit = temp * 9/5 + 32

    println("A temperatura de ${temp}ºC corresponde à ${fahrenheit}ºF")
}