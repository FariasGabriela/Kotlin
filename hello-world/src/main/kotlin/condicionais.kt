fun main(args : Array<String>) {
    val valor1: Int = 50;
    val valor2: Int = 30;

    //if comumente usado
    if (valor1 > valor2) {
        println("O valor 1 é maior!")
    } else {
        println("O valor 2 é maior!")
    }

    //If ternário
    val max: Int = if (valor1 > valor2) valor1 else valor2
    println("Resultado do if ternário: $max")

    //when
    when(valor1) {
        10 -> println("10")
        20 -> println("20")
        30 -> println("30")
        40 -> println("40")
        50 -> println("50")
        else -> {
            println("No options")
        }
    }

    //não existe switch

}