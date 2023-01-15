fun main(){ // Создала функцию main
    //1
    FavoriteFruit() // Вызвала функцию FavoriteFruit()
    FavoriteDrink() // Вызвала функцию FavoriteDrink()
    //2
    val firstinput = readln().toInt()
    val secondinput = readln().toInt()
    //val a:Int = multiplys(firstinput,secondinput)
    //val b:Int = multiplys(firstinput,secondinput)
    println(multiplys(firstinput,secondinput))
}
//1
fun FavoriteFruit(){  // Создала функцию FavoriteFruit()
    println("What is your favorite fruit:") //Распечатываю строку
    println("Bananas")//Распечатываю строку
}
//1
fun FavoriteDrink(){ // Создала функцию FavoriteDrink
    println("What is your favorite drink:")//Распечатываю строку
    println("Coca-cola")//Распечатываю строку
}
fun multiplys(firstinput:Int,secondinput:Int):Int {
    return firstinput+secondinput
}


