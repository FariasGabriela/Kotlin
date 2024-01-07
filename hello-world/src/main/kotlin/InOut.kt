fun main(args : Array<String>) {
    val name: String

    //Primeiro exemplo de código de input
    print("Digite seu nome: ")
    name = readLine()!!

    println("nome digitado: ")

    //Segundo exemplo de código de input
    print("Digite a idade: ")
    var idade: Int = readLine()!!.toInt()

    println("meu nome $name e minha idade $idade")
}