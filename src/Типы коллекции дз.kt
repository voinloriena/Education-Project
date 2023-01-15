fun main(){
    val list1 = arrayListOf<String>("qqq","www","ddd")
    val list2 = mutableListOf<String>("111","222","333")
    val text = list2.get(0) //val text = list[0]
    val text2 = list1[0]
    val set = setOf("aaa","bbb")//MutablesetOf изменяемый
    val map = mapOf("key" to "value", "new key" to "new value")
    println("Text = $text")
    list2.add("asdasd") //listof создает неизменяемый тип
    for(element in list2){// mutableListOf изменяемый тип
        println("For element: $element")
        //listof это массив
        //Arraylistof это коллекция
    }
    for(element in set){
        println(element[0])
    }

    println("Text: $text2")
    val value = map.get("key")
    println("For 1 element $value")




}