// First exercise
fun main() {
    val name: String = readln()
    when {
        name.length > 5 -> println("unique")
        else -> println("not unique")
    }

// Second exercise
    val input_number = readln().toInt()
    when(input_number){
       0 -> println("you input zero")
        1 -> println("you input one")
        2 -> println("you input two")
        3 -> println("you input three")
        4 -> println("you input four")
        5 -> println("you input five")
        else -> println("I don't know this number")
    }
}