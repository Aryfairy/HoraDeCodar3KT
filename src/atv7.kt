//7 - Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e imprima a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. São 6 notas ao total. Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido, deve ser solicitado um novo valor ao usuário.

fun main() {
    var soma = 0.0
    var cont = 0

    while (cont < 6) {
        println("Digite a nota do aluno (0 a 10): ")
        val nota = readln().toDouble()

        if (nota >= 0 && nota <= 10) {
            soma += nota
            cont++
        } else {
            println("Nota inválida! Digite novamente.")
        }
    }
    println("Média das 6 notas: ${soma / 6}")
}