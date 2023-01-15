import java.lang.Exception

fun main() {
    var person: Person = Person()
    person.age = 220
    println(person.age)

    try {
        //Some code stuff going here
        mockFailurApi()
    } catch (e: Exception) {
        println(e.message)
    }
    val data = person.age?: throw Exception ("Api failed")
}



fun mockFailurApi() {
    throw Exception("Api failed")
}
/*
Все исключения в Котлин являются наследниками класса Throwable У каждого исключения есть сообщение,трассировка
и (опционально) причина, по которой это исключение вероятно было вызвано.

Чтобы прехватить исключение, используйте выражение try catch

Для того чтобы возбудить исключение явным образом, используйте оператор throw.
 */
