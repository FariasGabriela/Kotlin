fun main(args : Array<String>) {
    firstFunction()
    println(secondFunction())
    println(funcaoLambda())
}

fun firstFunction() {
    println("chamando a primeira função")
}

fun secondFunction() : String {
    return "chamando segunda função"
}

fun funcaoLambda() : Int {
    val list = listOf<Int>(1, 5, 7, 8, 9, 10)
    return list.count { n -> n > 6 }
}