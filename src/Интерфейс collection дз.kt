//1
fun main(){
    var ListValues = listOf<Int>(1,2,3,4,5)
    var SetValues = setOf<Int>(1,2,3,4,5)
    val SumOF = ListValues + SetValues
    val name = listOf<String>("Andrey","Maksim")
    println("This number: ListValues + SetValues = ${calcSumOfElement(SumOF)}")
    //2
    println("Number ${operation(SumOF)}")
    println("Your name ${Nameoperation(name)}")
}
fun calcSumOfElement(Values: Collection<Int>):Int {
    var summa = 0
    for(i in Values)
        summa+=i
    return summa
}
//2
fun operation(values: Collection<Int>):Collection<Int> = values.filter {it % 2 == 0}

fun Nameoperation(values:Collection<String>){
    for (i in values){
    for (j in i)
        println("\t $j" )


    }
}



