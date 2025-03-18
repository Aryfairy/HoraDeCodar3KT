//5 - Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.

fun main() {
    println("Digite um número inteiro: ")
    val n1 = readln().toInt()

    var n2: Int
    while (true) {
        println("Digite o segundo número inteiro (maior que o anterior): ")
        n2 = readln().toInt()
        if (n2 > n1) break else println("Valor inválido. O segundo número deve ser maior que o primeiro.")
    }

    var soma = 0
    var quantidade = 0

    for (i in n1..n2) {
        soma += i
        quantidade++
    }

    val media1 = (n1 + n2) / 2.0
    val media2 = soma / quantidade.toDouble()

    println("Média de $n1 e $n2: $media1")
    println("Média de todos os números entre $n1 e $n2: $media2")
}