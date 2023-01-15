//1
fun main(){
    val Person_ = Human()//Cоздала абстрактную модель
    var Person1 = Person_.action(Cat1())//Переменная где буду вызывать класс
    var Person2 = Person_.action2(Game1())//Переменная где буду вызывать класс
}

class Human(){//Создала класс
    fun action (action:Cat1) = print(action.name)//Создала функцию и присвоела имя и наследовала класс
    fun action2 (action2: Game1) = print(action2.name)//Создала функцию и присвоела имя и наследовала класс
}

class Cat1(){//Создала класс
    var name:String = "Petting a cat"//Создала переменную для вызова в дальнейшем
}
class Game1(){
    val name:String = " and play computer games"//Создала переменную для вызова в дальнейшем
}

//2
//Создали класс напитков
open class Drinks

// Класс воды
open class Water:Drinks()
open class SugarWater:Water()
class RichWater:SugarWater()
//Класс чая
open class Tea:Drinks()
class TeaNoSugar:Tea()
class TeaSugar:Tea()

// Класс Кофе
open class Coffee:Drinks()
class CoffeeNoSugar:Coffee()
class CoffeeSugar():Coffee()


class Drink

class Waters(){
    private val Drink  = Drinks()
    private val SugarWaters = SugarWater()
    private val Rich = RichWater()

}

class Teas(){
    private val tea = Tea()
    private val TeaNoSugars = TeaNoSugar()
    private val TeaSugars = TeaSugar()
}