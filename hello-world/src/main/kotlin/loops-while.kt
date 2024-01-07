fun main(args : Array<String>) {
    //Variável do tipo imutavel
    val imutavel : Int = 10

    //Variável do tipo mutavel
    var mutavel : Int = 5

    println("------Exemplo de While------")
    while (mutavel < 10) {
        println("Valor da variável mutavel: $mutavel")
        mutavel++;
    }

    mutavel = 5;
    println("------Exemplo de Do While------")
    do {
        mutavel++;
        println("Valor da variável mutavel: $mutavel")
    } while (mutavel < 10)
}