fun main(){
    var Array = listOf(2,3.0,3,"строка",true,5,6f)
    var ListArray = ArrayList<Boolean>()
    var iteratorlist = Array.listIterator()

    while(iteratorlist.hasNext())
        ListArray += if (iteratorlist.next() is Int) listOf(true)
        else listOf(false)

    println(ListArray)

}


