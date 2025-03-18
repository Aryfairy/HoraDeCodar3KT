// 6- Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final. Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.

fun main() {
    var aprovados = 0

    println("Verifique a aprovação dos alunos")

    while (true) {
        println("Digite a primeira nota: ")
        val n1 = readln().toDouble()
        print("Digite a segunda nota: ")
        val n2 = readln().toDouble()

        val media = (n1 + n2) / 2
        println(" média desse aluno é: $media")

        if (media >= 9.5) {
            aprovados++
        }

        while (true) {
            println("Deseja calcular a média de outro aluno? (S/N): ")
            val resposta = readln()

            if (resposta == "S") {
                break
            } else if (resposta == "N") {
                println("A quantidade de alunos aprovados pela média é: $aprovados")
                return
            } else {
                println("Entrada inválida. Tente novamente.")
            }
        }
    }
}