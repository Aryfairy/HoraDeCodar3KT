// Escreva um algoritmo para ler 2 valores informados pelo usuário e se o segundo valor informado for igual ou menor que ZERO, deve ser lido um novo valor. Ou seja, para o segundo valor não pode ser aceito o valor zero, nem um valor negativo. O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor e exibir o resultado ao usuário.

fun main() {
    println("====================================")
    println("  Resolva sua operação de divisão")
    println("====================================")

    println("Digite o dividendo: ")
    var dividendo = readln().toDouble()

    println("Digite o divisor (é necessário ser positivo e diferente de zero): ")
    var divisor = readln().toDouble()

    while (divisor <= 0) {
        println("Valor inválido. Tente novamente!")
        println("Digite o divisor (é necessário ser positivo e diferente de zero): ")
        divisor = readln().toDouble()
    }

    val resul = dividendo / divisor
    println("O resultado de $dividendo dividido por $divisor é: $resul")
}