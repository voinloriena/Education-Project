fun main(){
    var myStr: String? = "String"
    //myStr=null
    //val lenght:Int = if(myStr!=null) myStr.length else 0//Это все можно заменить elvis операторами
    val lenght:Int=myStr?.length ?: 0 //elvis операторы позволяет убирать условия
    //Выражнение справа ?: 0 будет выполняться если переменная mystr null
    // Если mystr не пустое значение то возвращается длинна myStr?.lenght


    // Не рекумендуется к использованию, ломаешь логику null безопасности
    // null Безопастность уберегант от NPE(чтобы не была пустных значений)
    // !! этот оператор передывает любое значение в none null тип и выдает
    // NPE(null point exception) если это значение null

    val lenghts:Int = myStr!!.length//Это не безопасный тип

    //Как class exception если переменная другого типа
    // Безопасное приведение которое просто вернет нам null значения если попытка приведения не удалась
    val myInt:Int?=myStr as? Int//Мы превести пример int как mystr
    //Если котлину не удастся myStr перевести в int вернет null значения
    



}