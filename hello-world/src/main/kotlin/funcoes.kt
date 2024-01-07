fun main(args : Array<String>) {
    firstFunction()
    println(secondFunction())
}

fun firstFunction() {
    println("chamando a primeira função")
}

fun secondFunction() : String {
    return "chamando segunda função"
}