//8 - Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.N  é um valor informado pelo usuário

fun main() {
    println("Digite um número inteiro maior que zero: ")
    var n = readln().toInt()

    if (n <= 0) {
        println("Valor inválido. Tente novamente!")
    } else {
        for (i in 1..n) {
            print("$i ")
        }
    }
}