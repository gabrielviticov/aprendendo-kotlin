package estruturado.exercicios.ex016

//Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente de um triângulo retângulo. Calcule e mostre o comprimento da hipotenusa.
fun main(){
    val cateto_oposto: Double
    val cateto_adjacente: Double
    var hipotenusa: Double

    print("Informe o comprimento do cateto oposto: ")
    cateto_oposto = readln().toDouble()

    print("Informe o comprimento do cateto adjacente: ")
    cateto_adjacente = readln().toDouble()

    hipotenusa = Math.hypot(cateto_oposto, cateto_adjacente)

    println("Com as medidas de ${cateto_oposto} x ${cateto_adjacente} temos uma hipotenusa de ${"%.2f".format(hipotenusa)}")
}