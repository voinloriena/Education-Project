fun main(){
    /*
     Коллекция с элементами
     Пустая коллекция
     Конструкторы
     Копирование коллекции
     Вызов вспомогательных функции
     */
    //Коллекции с элементами
    //listOf<>()
    //setOf<>()
   // mutableMapOf<>()
    //Если создавать пустую коллекцию надо указывать ее тип данных
    //mutablelistOf<String>()
    mutableMapOf<String, Any>().apply{
        this["key1"] = 1;
        this["key2"] = true;
        this["key3"] = "key3"
    }
    //Этот метод используется чтобы уменьшить размер файла в отличие от to

    val emptyMap = emptyMap<String, String>()//Cоздание пустой коллекции
    //Нужно указывать тип переменной ключ и значения в словаре
 //   mutableMapOf<String,Any>() Cловарь надо указывать тип переменных если создаешь пустой

    val Mylisy = List(4,{it*2})// Указываем размер значении
    println(Mylisy)
}