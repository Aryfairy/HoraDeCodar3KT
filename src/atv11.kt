//11 - Escreva um programa em que o usuário informe 10 valores e escreva quantos desses valores lidos estão entre os números 24 e 42 (incluindo os valores 24 e 42) e quantos deles estão fora deste intervalo.
fun main() {
    println("=================================")
    println("            TABUADA")
    println("=================================")

    println("Digite um número inteiro positivo: ")
    var n = readln().toInt()

    for (i in 1..n) {
        println("-------------------------")
        println("Tabuada do: $i")
        println("-------------------------")

        for (t in 0..10) {
            println("$i x $t = ${i * t}")
        }
    }
}