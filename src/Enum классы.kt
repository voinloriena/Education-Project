fun main() {
    var status: Status = Status.INITIAL
    // Вызов удаленного кода
    status = Status.LOADING
// Удаленный код возвращает результат
    status = Status.ERROR

    if (status == Status.ERROR) {
        println("Ошибка загрузки")
    } else {
        println("Данные успешно загружены")
    }
}


enum class Status{
    INITIAL,LOADING,SUCCESS,ERROR,
}