
fun main(){//Создала функцию
    //2
    println("Input little words")//Распечатала строку
    val letter = readln()[0]
    println(Somestring(Description, letter))//Вызвала функцию в которой есть два аргумента с длинной строки
    //1
println(Somenumb(1,null,3,4,5,6).contentToString())//Вызвала функцию с массивом
    //внутру которого имеются целочисленные и пустые значения
    //Для вывода значений массива используйте класс Arrays с методом toString(),
// который вернёт результат в удобном и читаемом виде. Сейчас в Kotlin появилась
// функция contentToString(), которая является предпочтительным вариантом.
}
//1
fun Somenumb(x:Int = 1, z:Int?=null, a:Int=3, b:Int=4,c:Int=5,d:Int=6): Array<Int> {
    // Создала массив со значениями и одним пустым значениями использовала безопасный
    // тип через Array указала тип данных целочисленное
    var Number:Array<Int>
    // Создала пустую переменную с Array указала тип данных целочисленное
    if (z == null)
    //Создала условия если в массиве имеются пустые значения
        Number = arrayOf(a,b,c,x,d)
    //Распечатает переменную с заданным массивом
    else Number = arrayOf(a,b,c,d,x,z)
    //Второе условия если в массиве нет пустыхв выполнится это условие
    // с массивом данных которые не пустые
    Number.sort()// с помошью sort() отсортировала данные по возрастанию
    return Number//Вернула функцию Number
}
//2
val Description = "\"Group description changed to \" \"My Chat\" " +
        "is a private chat for your " + "personal stuff. You can take notes, " +
        "or upload files for private purposes."

fun Somestring(text:String, letter: Char):Int {//Создала функцию
    //var Input = readln()//Создала переменную чтобы передавать данные
    var numb = 0
    for(char in text) {
        if (char == letter) numb++
    }
        //Создала переменную со стороками
        //
    // println(Input)//Разпечатала переменную которую мы вводим
        //println(Description)//Распечатала переменную со строкой
        //println(Input.length)//Распечатала длинну переменной
        //println(Description.length)// Распечатала длинну переменной
        return numb
    }
