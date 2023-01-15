fun main(){
    var Setlist = mutableSetOf<Int>(1,2,3,4,5,6)
    val List = mutableListOf<Int>(1,2,3,4,5,6)
    Setlist.add(7)
    List.add(7)
    println(Setlist); println(Setlist.size)
    println(List);println(List.size)
}
// List коллекция может в себе содержать не уникальные значения
// Set в себе содержит только уникальные значения, это означает что
// значения не повторяются