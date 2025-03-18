// Escreva um programa em que o usuário informe 10 valores e escreva quantos desses valores lidos estão entre os números 24 e 42 (incluindo os valores 24 e 42) e quantos deles estão fora deste intervalo.

fun main() {
    var dentro = 0
    var fora = 0
    var contador = 0

    while (contador < 10) {
        print("Digite um número positivo inteiro: ")
        val nums = readln().toIntOrNull()

        if (nums != null) {
            if (nums in 24..42) {
                dentro++
            } else {
                fora++
            }
            contador++
        } else {
            println("Entrada inválida. Digite um número inteiro válido.")
        }
    }
    println("A quantidade de números digitados que estão entre os números 24 e 42 é: $dentro")
    println("A quantidade de números digitados que NÃO estão entre os números 24 e 42 é: $fora")
}
