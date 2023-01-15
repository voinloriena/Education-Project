fun main() {
/*
Map не является наследником интерфейса Collection; однако это один из типов
коллекции в Kotlin. Map хранит пары ключ значения ключи уникальны но разные ключи
могут иметь одинаковые значения. Интерфейс Map предоставляет такие функции как
доступ к значению по ключу, поиск ключей и значений и тд
Это словари
 */

    val valueMap = mapOf("one" to "one", "two" to 2, "three" to 3)// mapof
    // это создание словаря и указываешь внутри словарь и значения
    println(valueMap["one"])// [] - через скобки и названия ключа обращаешься к словарю
    println(valueMap.keys)//keys позволяет распечатывать список из ключей
    println(valueMap.values)//values позволяет распечатывать значения в виде списка
    if ("one" in valueMap){//Можно ставить условия и проверять ключи и значения
        println("It's true")

    }
    val MutableValueMap = mutableMapOf("one" to "one", "two" to 2, "three" to 3)

    MutableValueMap.put("four",4)// c помошью put можно добавлять
    MutableValueMap["five"]  = 4
    println(MutableValueMap)
    //Можно перезаписывать данные.
}