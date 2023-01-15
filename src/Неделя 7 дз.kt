fun main(){
    val numOdd = OddChecker()//Создаю переменную и передаю класс
    numOdd.isOdd(10)//Переменной передаю функцию и значение которое надо передать


    val numOdd2 = OddCheckerChild()//Создаю переменную и передаю класс
    numOdd2.isOddNegative(20)//Переменной передаю функцию и значение которое надо передать

}

open class OddChecker {//Родительский класс, если мы от него хотим уноследавать пишем open перед class
    open fun isOdd(num:Int) {//Функция родительского класса который хотим уноследовать
        if(num*num%2 == 0) {// Функция понимает какое число и возводит в квадрат и проверяет на целочисленное деление
            println(false); println("Это четное число") //Результат если четное число
        }
        else {
            println(true); println("Это нечетное число")// Результат не четное число
        }
    }

}

class OddCheckerChild:OddChecker(){// Дочерный класс
    fun isOddNegative(num: Int) = isOdd(num)//Функция isOddNegative
    override fun isOdd(num:Int) {//Переопределение функции
        if ((num * num )% 2 == 0){// Функция понимает какое число и возводит в квадрат и проверяет на целочисленное деление
            println("Это четное")//Результат если четное число
            println(true)
        }
        else {
            println("Это не четное")// Результат не четное число
            println(false)
        }
    }
}
