//1
class Example constructor(call:String){//Создала класс передала метод constructor передала конструктор call и присвоела тип данных строка
    var product = call // Создала переменную продукт и присвоела конструктор
    init {//Вызвала конструктор чтобы делать операции внутри нее
        println(call)//Вызвала конструктор
    }
}
//2
class Animal (type:String){//Создала класс передала метод constructor передала конструктор type и присвоела тип данных строка
    var animal = type// Создала переменную продукт и присвоела конструктор
    init{//Вызвала конструктор чтобы делать операции внутри нее
        println("You chose: $type")//Вызвала конструктор
    }
}
fun main(){//Создала функцию
    var example:Example = Example("Method called!")//Создала переменные вызвала класс и передала строку которую хочу распечатать
    var animal:Animal = Animal("Elephant, Zebra, Lion, Eagle, Wolf, Fox, Bear, Raven, Tiger")//Создала переменные вызвала класс и передала строку которую хочу распечатать
}

