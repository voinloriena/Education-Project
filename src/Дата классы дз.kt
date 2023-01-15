data class users constructor(var fistname:String, var name:String, var email:String, var gender:String, var FavoriteWord:String)
//Создала дата класс с конструктором и ключами и их типами переменных
fun main() {
    var user1 = users("Uzumaki", "Naruto", "alumni.com", "male", "may the force come with you")
    var user2 = users("Hyuga", "Hinata", "alumni.com", "female", "What do we say to the god of deadth")
    var user3 = users("Monkey", "Lufi", "nu.com", "male", "One peace")
//Создала три объекта класса
    println(user1.email == user2.email)//Сравнила данные объектов класса
    println(user1.FavoriteWord == user2.FavoriteWord)//Сравнила данные объектов класса
    println(user1.equals(user2)) //сравнивает два объекта на равенство
    println(user3.hashCode()) //возвращает хеш-код объекта
    println(user1.toString())//возвращает строковое представление объекта
    println(user1.copy(fistname = "Todoroki"))//копирует данные объекта в другой объект либо изменяет
}




/*2
equals(): сравнивает два объекта на равенство
hashCode(): возвращает хеш-код объекта
toString(): возвращает строковое представление объекта
copy(): копирует данные объекта в другой объект
 */