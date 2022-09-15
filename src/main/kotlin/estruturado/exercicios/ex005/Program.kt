package estruturado.exercicios.ex005
import java.util.Locale
import kotlin.math.sqrt

//Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.
fun main(){
    val config = Locale.setDefault(Locale.US)
    val num: Int
    val dobro: Int
    val triplo: Int
    val raiz: Double

    print("Informe um número [inteiro]: ")
    num = readln().toInt()

    dobro = num * 2
    triplo = num * 3

    raiz = sqrt(num.toDouble())

    println("Analisando o valor ${num}")
    println("Seu dobro é ${dobro}")
    println("Seu triplo é ${triplo}")
    println("Sua raiz quadrada é ${"%.2f".format(raiz)}")
}