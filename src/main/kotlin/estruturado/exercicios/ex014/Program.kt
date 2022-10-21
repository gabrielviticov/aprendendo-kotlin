package estruturado.exercicios.ex014

//Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$0,15 por Km rodado.

fun main(){
    print("Quantos dias o carro foi alugado? ")
    val dias_carro_alugado = readln().toInt()
    print("Quantos kilometros rodados? ")
    val km_carro_alugado = readln().toFloat()

    val total = (dias_carro_alugado * 60) + (km_carro_alugado * 0.15)
    println("O total a se pagar é de R$${String.format("%.2f", total)}")
}