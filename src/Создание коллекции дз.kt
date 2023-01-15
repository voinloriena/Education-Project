fun main(){
    val DictionaryList = mutableMapOf<Any,Any>("key" to 1, 1 to false, 6.5 to true, 5.5 to 25, 5 to 2.5)
    var List = mutableListOf(1.5,"Hello","Kotlin",false,true)
    var Set = mutableSetOf(54,56.5 ,"Nevermore Academy",true, false)

    val MysetArray = ArrayList<Boolean>()
    for(i in Set) {
       MysetArray += if (i is Int) listOf(true)
        else listOf(false)
    }
    println(MysetArray)

    val MylistArray = ArrayList<Boolean>()
    for(j in List){
        MylistArray += if(j is Int) true
        else false

    }
    println(MylistArray)

    val MyDictionary = ArrayList<Boolean>()
   DictionaryList.values.forEachIndexed { _, n ->
       MyDictionary += if (n is Int) listOf(true)
        else listOf(false)
   }
    println(MyDictionary)
    
}
// it автоматически доступно по умолчанию для параметра лямбда выражения
// Если же у вас несколько вложенных лямбда выражений тогда явное именование параметров
// становится необходимостью

/*
Если помимо самого элемента нужен еще и его порядковый номер в коллекции разумеется
начинающиеся с нуля то используйте метод forEachIndexed () ТОгда в лямбде нужно в
явном виде указывать два параметра вместо одного дефолтного it индекс и элемент
 */