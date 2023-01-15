import kotlin.reflect.typeOf

fun main(){
    /*
    First exercise
     */
    val first: Int = 5
    println(first.toShort())
    println(first.toByte())
    println(first.toLong())
    println(first.toString())
    /*
    second exercise
     */
    val MAX_VALUE: Long = 9223372036854775807L//value=2^63
    /*
    third exercise
     */
    println(MAX_VALUE.toInt())
    println(MAX_VALUE.toShort())
    println(MAX_VALUE.toByte())
/*
Все связанно с размерами переменной. Нужно смотреть сколько значений может принимать каждый тип данных
 */

}