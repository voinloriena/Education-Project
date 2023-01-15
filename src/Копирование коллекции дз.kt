fun main(){
    var list = mutableListOf<Int>(1,2,3,4,5,6)//Создала список с целочисленным типом
    val list1 = mutableListOf<Int>(7,8,9,10)//Создала список с целочисленным типом
    val list2 = mutableListOf<Int>(11,12,13,14)//Создала список с целочисленным типом
    var NewList = list.toMutableList()
    var Newlist1 = list + list1 + list2//Обьединила список
    list.removeAt(3)
    println(list)
    println(NewList)
    println("New list of include three lists $Newlist1")//разпетала копированный список
    ListCollection(Newlist1)//Вызвала функцию со списком
}
fun ListCollection(Copylist:List<Int>):MutableList<Int>{//Создала функцию и указала типы переменных
    val CopyList1 = Copylist.toMutableList().apply {//Возвращаю обьект переданный в аргументе
        removeLast()//Удаляю последний элемент
    }
    return CopyList1//Возвращаю функцию
}