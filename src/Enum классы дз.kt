data class  userss constructor(var firstname:String,var name:String,val email:String,val age:String,var favoriteWords:String, val method:Method)
// Cоздала дата класс со значениями пользователей.
fun main(){
    var user1 = userss("Abzhanova","Elvira","alumni.edu.kz","22","There is only one god, and his name is Death. And there is only one thing we say to Death: “Not today",Method.PREMIUM)
    var user2 = userss("Pitt","Pitt","@spiderman.com","24","Amazing day",Method.STANDARD)
    var user3 = userss("Uchica","Madara",".com","75","This world is mine",Method.STANDARD)
    var user4 = userss("Uchica","Itachi",".com","28","I have to find my brother",Method.PREMIUM)
    //Создала переменные с данными о пользователей
    var user5 = arrayOf(user1,user2,user3,user4)//Создала переменную которая принимает в себе 4 переменных
    println("Premium generation")
    for (i in user5.indices) {//Прошлась через цикл по каждому значению
        if (user5[i].method == Method.PREMIUM) {//Поставила условия
            println(user5[i])
        }
    }
}

enum class Method{//Создала enum класс и поделила значения
    PREMIUM,STANDARD,
}