fun main(args : Array<String>) {
    println("Controle de loop's")

    //array
    val arr : Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //for
    println("Exemplo de for: ")
    for (item in arr) {
        println("item: $item")
    }

    //Hash map
    val map = mutableMapOf<Int, Any>()

    //Java style
    map.put(1, "Gabriela")

    //Programming
    map[2] = "João"

    //Kotlin
    map += 3 to "Maria"

    println("Exemplo de for com o map")
    for (item in map) {
        println("Map --> Posição: ${item.key} / Value: ${item.value}")
    }
}