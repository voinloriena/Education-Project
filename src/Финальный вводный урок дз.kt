import java.lang.Exception
//1
fun main() {
    println("Enter any even number") // Распечатываю значение
    try {
        throwIfEven(readln().toInt())// Функция которая вычисляет исключения
    } catch (a: Exception) {// Метод для нахождения исключения
        println("it's even number")
    }


//2
    println("Enter your age")// Распечатываю значен
    try {
        EnterAge(readln().toInt())// Функция которая вычисляет исключения
    } catch (e:Exception){// Метод для нахождения исключения
       println("The entered value is not Integer")
    }
}
//1
fun throwIfEven(num: Int) {//Функция задаю тип данных
    if (num % 2 == 0) //условие
        throw Exception()// если число четное вызывает exception
    else
        println("$num It's on an odd number")
}
//2
fun EnterAge(age:Any){//Функция задаю тип данных
    if(age is Int)//Условие проверяет вводимое значение на тип данных
        println("$age it's correct value")
    else throw Exception()//если тип данных не числовой вызывает exception
}