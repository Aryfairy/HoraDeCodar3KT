//2 - Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. No final da repetição escreva "EXPLOSÃO".


fun main() {

    println("OPS!!!! VOCÊ ACABOU DE ATIVAR A BOMBA!!!!!")
    println("                        $#     #      #¢ ")
    println("          #######         #¢   #    ø#   ")
    println("          ##    ø###       oø  ø  øo    ")
    println("          #7       ###       1   1    1o")
    println("       #######       ###7          1o###ø")
    println("       #######         ########    1     ")
    println("     o#########ø                     o$¢  ")
    println("   ###############          ¢  1ø      1##")
    println("  #################o       1$   #      ")
    println(" ###################       #     o#     ")
    println(" ####################     ##           ")
    println("  ##################                   ")
    println("   ################                    ")
    println("     ############                      ")
    println("       ########                        ")
    println("=============================================")
    println("  Contagem regressiva para a EXPLOSÃO:")
    println("=============================================")

    var cont = 30
    while(cont >= 0) {
        println("Detonação em: $cont")
        cont = cont - 1
        Thread.sleep(500)
    }
    println("      💥💥💥EXPLOSÃOOO!!!!💥💥💥")
    println("         ──▄────▄▄▄▄▄▄▄────▄───")
    println("         ─▀▀▄─▄█████████▄─▄▀▀──")
    println("         ─────██─▀███▀─██──────")
    println("         ───▄─▀████▀████▀─▄────")
    println("         ─▀█────██▀█▀██────█▀──")
}
