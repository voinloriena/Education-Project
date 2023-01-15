fun main(){
    //1
    //var a:String? = null//NPE (Null pointer exception)
    //val b:Int? = null //NPE
    //var c:Float? = null //NPE
    //println(a!!.length);println(b!!.toInt());println(c!!.toDouble())




    //2
    var name:String? = null // Создаем переменную у делаем ее пустой
    name = "IamNotNull" // Присваеваем переменной стороковое значение
    // Проблим не вышла переменная name присвоела себе строковое значение
    println(name)// Распечатываем переменную


}