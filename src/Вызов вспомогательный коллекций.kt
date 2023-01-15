fun main(){
    val numbers = listOf(1,2,3,4,5,6)
    val newCollrction = numbers.filter { it%2 == 0 }
    // Создается переменная и
    // Функция фильр помогает отфильтровать значения
    val newCollection1 = numbers.map { it%2 == 0 }
    // Приобразовали в буленновые значения
    // Коллекции могут создаваться над работами другими коллекциями
    println(newCollrction)
    println(newCollection1)
}
