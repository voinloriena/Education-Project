import kotlin.reflect.typeOf
fun main() {
    //println("Hello World")
    //Byte 8 bit min value=-128 max value= 127
    //Short 16 bit min value=-33768 max value=32767
    //Int 32 bit min value=-2^31 max value=2^31 -1
    //Long 64 bit min value=2^63 max value=2^63 -1
    // val immutable variable.
    // var mutable variable.
    var myByte: Byte = 127
    val myShort: Short = 32766
    var myInt:  Int= 2147483647
    var myLong: Long = 2305843009213693999
    val height: Double = 1.78
    val pi: Float = 3.14F
    var inputText = readLine()!!.toInt()
    var inputText_Two = readLine()!!.toInt()
    println("Next number $inputText number -${inputText+1}")
    println("Previous number $inputText_Two number -${inputText_Two-1}")
    println(myInt+myShort); println(myInt+myByte);println(myInt+myLong);println(myInt+height); println(myInt+pi)
}
