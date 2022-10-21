package estruturado.exercicios.ex018

import java.util.Random
import kotlin.collections.shuffle

//Um professor quer sortear um dos seus quatro alunos para apagar o quadro. Faça um programa que ajude ele, lendo o nome dos alunos e escrevendo na tela o nome do escolhido.
fun main(){
    var aluno1: String
    var aluno2: String
    var aluno3: String
    var aluno4: String
    var lista: Array<String>
    var sorted = ""

    print("Nome do primeiro aluno: ")
    aluno1 = readlnOrNull().toString()

    print("Nome do segundo aluno: ")
    aluno2 = readlnOrNull().toString()

    print("Nome do terceiro aluno: ")
    aluno3 = readlnOrNull().toString()

    print("Nome do quarto aluno: ")
    aluno4 = readlnOrNull().toString()

    lista = [aluno1, aluno2, aluno3, aluno4]
    sorted = lista.toString()
    sorted.s
}