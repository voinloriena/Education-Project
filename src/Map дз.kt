fun main() {
    println("Input your login")//Распечатала cтроку
    val input = readln()//Создала переменную чтобы вводить значения
    val AccoutLoginParol = mapOf("admin" to "admin", "inspire" to 123456, "inhabitens" to "V1q14t")
    //Создала словарь и указала ключ значение
        if (input == "ableacademy")//поставила условия если ввести  значение
        //выводит весь словарь со значениями
            println("You are input cheat $AccoutLoginParol")//Распечатала строку с переменной
        else if (input in AccoutLoginParol)
            println("Your password ${AccoutLoginParol[input]}")
        else//Поставила условия
            println("I don't know this login")//Если строка которую буду вводить в переменную
        //не будет соответствовать будет распечатывать это сообщение


}