fun main(){
    val myString: String = "Elvira Abzhanova"
    val myCharFromString = myString[0]

    print(myCharFromString) // Строки неизменяемый тип

   val myStringNew: String ="fdgdfgd"
    println(myStringNew.uppercase()) // Увеличивает все значения
    println(myStringNew)

    val myStr = myStringNew+myString // Обьединение переменных

    print(myStr)

    val someString = "\nHello world \n it me"
    println(someString) //Экранированные значения

    val defultString = """
           val myStringNew: String ="fdgdfgd"
    println(myStringNew.uppercase()) // Увеличивает все значения
    println(myStringNew)

    val myStr = myStringNew+myString // Обьединение переменных

    print(myStr)

    val someString = "\nHello world \n it me" 
        
    """.trimIndent()// Это функция чтобы не была больших пробелов
println(defultString)

    val myCustomString = "MyShort variable values is $myStr"
    println(myCustomString)

    val myCustomOperating = "My short and MyByte sum $myStr + $myString = ${myStr+myString}"
    println(myCustomOperating)

}