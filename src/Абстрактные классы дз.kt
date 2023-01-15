//1
fun main(){ // Создала функцию
    val fish:Animals = Fish("Fish")// Cоздала обьект класса Bird с параметром абстрактного класса Animal
    val tiger:Animals = Tiger("Tiger")// Cоздала обьект класса Tiger с параметром абстрактного класса Animal
    val bird:Animals = Bird("Bird")// Cоздала обьект класса Bird с параметром абстрактного класса Animal
    //2
    val Boruto:Naruto = Boruto("Boruto","Rasengan")
    val Itachi:Naruto = Itachi("Itachi","Sharingan")

    print("This is - ")
    fish.haveLuch()
    print("This is - ")
    tiger.haveLuch()
    print("This is - ")
    bird.haveLuch()


    //2
    Boruto.mybiuld()
    Itachi.mybiuld()
}


abstract class Animals(val name:String){//Создала абстрактный класс с параметром name
abstract fun haveLuch()//Создала абстрактную функцию haveLunch()
}


class Fish(name:String):Animals(name){//Создала абстрактный класс с параметром name
override fun haveLuch() {//Создала абстрактную функцию haveLunch()
    println(name)
}
}

class Tiger(name:String):Animals(name){//Создала абстрактный класс с параметром name
override fun haveLuch() {//Создала абстрактную функцию haveLunch()
    println(name)
}
}

class Bird(name:String):Animals(name){//Создала абстрактный класс с параметром name
override fun haveLuch() {//Создала абстрактную функцию haveLunch()
    println(name)
}
}

//2
abstract class Naruto(val name: String, val able: String){
    abstract fun mybiuld()
}

class Boruto(name: String,able:String):Naruto(name,able){
    override fun mybiuld() {
        println("My name is $name. My ability $able")

    }
}


class Itachi(name:String, able: String):Naruto(name,able){
    override fun mybiuld() {
        println("My name is $name. My ability $able")
    }
}