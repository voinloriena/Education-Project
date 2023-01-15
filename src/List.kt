fun main(){
    var values = listOf("o","t","three")
    val mutableValues = mutableListOf<String>("o","t","three")
    mutableValues.add("five")
    mutableValues.removeAt(0)
    println(mutableValues)
    println(values.get(0))
    println(values[1])
    println(values[2])
    println(values[2][0])

}
fun iterateThrowValue(values: List<String>){
    for(value in values) println(value)
}
/*
List хранит элементы в определенном порядке и обеспечивает к ним доступ по индексу.
Индексы начинаются с нуля 0-индекс первого элемента и идут до lastIndex, который равен
(last.size-1)

Элементы списка(в том числе null) могут дублироваться: список может содержать
любые количество одинаковых объектов. Два списка считаются равными, если они имеют
одинаковый размер и их элементы в одних и тех позициях структурно равны.
 */