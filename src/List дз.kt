fun main() {
    val list = listOf<Int>(1, 3, 2, 5, 4)
    val list2 = listOf<Int>(1, 3, 2, 5, 4)
    val sort = list.sorted()
    val size = list.size
    var sum = 0
    for (i in sort)
        sum += i
    val sorted = list2.sorted()
    val number = buildList {
        for (i in sorted)
            add(i * i * i)
    }
    println("Sorted number $sort, \nSum of list $sum, \nSize in list $size, \nNumber $number")

    val mutableListof = mutableListOf(1, 0.5, "NY", false, null)
    val ArrayList = arrayListOf<Boolean>()
    for ( i in mutableListof){

    ArrayList.add(if(i is Int)true else false)

    }
    println(ArrayList)
}



