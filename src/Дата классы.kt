//data class "naruto constructor(type: String)" { // Будет двоиться создавать копию
    // Формулирует функцию копию
//var envoirment = type
//Дата классы должны удовлетворать требованиям дата классы должны иметь один параметр должен быть отмечен как var или val пример снизу
//data class Product constructor(var title: String, var isFavorite: Boolean = false){
// super обращение к родительскому классу, а this типа к самому себе
fun main(){
    val user: User = User()
    val product:Product = Product(user = user)// Сравнение данных
    val product1:Product = Product(user = user)
    val product2 = product.copy(isFavorite = true)//Копируем данные и можем перезаписать значения
    println(product == product1)
    println(product.toString())
    println(product2)
}
/*
Иногда классы бывают необходимы только для хранения некоторых данных.
В Kotlin такие классы называются data-классы. Они определяются с модификатором data:
 */