//1
interface Car{//создан интерфейс car с функцией drive
    fun drive(description:String){//Cоздаю функцию и переменную с типом данных
        println("$description drived")
    }
}

class Audi:Car{//Класс Audi наследует интерфейс car
    init {//выполнение функции drive из интерфейса car
        drive("Audi")//Функция drive записывает внутри себя
}
}

class BMW:Car{//Класс BMW наследует интерфейс car
    init {//выполнение функции drive из интерфейса car
        drive("BMW")//Функция drive записывает внутри себя
    }
}

fun main(){
    val audi = Audi()//Вызываем функцию
    val bmw = BMW()//Вызываем функцию
    val cars = listOf<Car>(audi,bmw)//Создаю коллекциию типов


    //2
    val dog = dog()
    dog.meal()
    val cat = cat()
    cat.meal()
    val hamster = hamster()
    hamster.meal()
}
//2

interface eat{//создан интерфейс eat с методом Eat
    fun meal(){
        println("My pet eat")
    }
}

class dog:eat {//класс dog имплементирует интерфейс eat
    private val name:String = "Dog"
    override fun meal(){//переопределение фун Eat для dog
        super.meal()//С помощью ключевого слова super в производном классе можно обращаться к реализации из базового класса.
        println("$name сразу начинает кушать" )
    }
}

class cat:eat{
    private val name:String = "Cat"
    override fun meal() {
        super.meal()
        println("$name смотрит несколько секунд на хозяина и потом начинает кушать")
    }
}

class hamster:eat{
    private val name:String = "Hamster"
    override fun meal() {
        super.meal()
        println("$name бегает по клетке и начинает кушать")
    }
}
