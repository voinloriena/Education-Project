fun main() {
    /*
    Как создать функцию
    1 Задаем название функции
    2 Передаем параметры
    3 Указываем возвращаемый тип
    4 Пишем логигу функции
    Возвращаем информацию
     */
    var a: Int = multiply(10,10)//C помощью функции умножаю два значения
    var b: Int = multiply(2,10)//C помощью функции умножаю два значения
    var c: Int = multiply(20,10)//C помощью функции умножаю два значения
    var d: Int = multiplyByTwo(20) //multiplyByTwo название функции и значение функции

    println(a)
    println(b)
    println(c)
    println(d)

}
    fun multiplyByTwo(x: Int): Int {
        return x*2
    }
    fun multiply(x:Int,y:Int):Int{ //:Int передаем тип данных функции
        return x*y //Возвращаем функцию и умножаем два переменных
    }
