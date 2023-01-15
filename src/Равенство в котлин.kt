import java.time.temporal.ValueRange

fun main(){
/*
Равенство проверяется == позволяет значения в переменных
===  сравнивает ссылки
equals сравнивает ссылки при сравнении переменных float and double
== сравнение содержимого дата класса
=== Проверка значении также как ==

 */
    data class A(val value:String)
    val a = A("A")//Происходит сравнение ссылок а не значении
    val b = A("A")
    println(a == b)
    println(a === b)//Будет выдавать false поскольку обертки переменной разные
    //println(a.value.equals(b.value)) // Сравнение ссылок value
    println(a.equals(b))

/*
В дата классе можно сравнивать значения но сравнение ссылок вернет ложь
поскольку переменную имеют разные ссылки
 */
    val p = 0.0f
    val n = -0.0f
    println(p == n)
    println(p === n)
    println(p.equals(n))



}