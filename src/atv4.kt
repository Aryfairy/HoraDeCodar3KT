//4 - Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive).

fun main() {
    var soma = 0.0
    var quant = 0

    for (num in 15..100) {
        soma += num
        quant++
    }

    val media = soma / quant

    println("A média aritmética dos números entre 15 e 100 é: $media")
}