fun main(){
    val name = fish1("Fish","Swimming")/*Cоздан обьект класса fish */
    name.haveLunch()// метод выводит значение прописанный в класса фиш
    name.action()// функция реализируется инерфейсом актион
    val name1 = tiger1("Tiger","Running")/*Cоздан обьект класса tiger */
    name1.haveLunch()// метод выводит значение прописанный в класса фиш
    name1.action()// функция реализируется инерфейсом актион
    val name2 = bird1("Bird","Flying")/*Cоздан обьект класса bird */
    name2.haveLunch()// метод выводит значение прописанный в класса фиш
    name2.action()// функция реализируется инерфейсом актион
}

abstract class Animal1(val name:String){ //абстрактный класс с переменной name
    abstract fun haveLunch()//абстрактная функция
}

/*класс fish1 использует параметры класса animal и интерфейса action, переменная из интерфейса action
объявлена в свойствах класса */
class fish1(name:String, override val activity: String):Animal1(name),Action {// Класс с типами переменных и их наследование
    override fun haveLunch() {//Унеследование абстрактного класса
        println(name)
    }
}
/*класс tiger1 использует параметры класса animal и интерфейса action, переменная из интерфейса action
объявлена в свойствах класса */
class tiger1(name:String,override val activity: String):Animal1(name),Action{// Класс с типами переменных и их наследование
    override fun haveLunch() {//Унеследование абстрактного класса
        println("Tiger")
    }
}
/*класс bird1 использует параметры класса animal и интерфейса action, переменная из интерфейса action
объявлена в свойствах класса */
class bird1(name: String, override val activity: String):Animal1(name),Action{// Класс с типами переменных и их наследование
    override fun haveLunch() {//Унеследование абстрактного класса
        println("Bird")
    }

}

interface Action{//Создала интерфейс
    val activity:String//Интерфейсу создали переменную
    fun action(){//Интефейс имеет функцию которая будет наследовать действие переменной
        println("I choose $activity")
    }
}