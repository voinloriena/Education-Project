//1
fun main() {
    var number = 0
    do{number++;
        println(number) }
    while(number < 10)


    //2
        /*
    Будет вывадить 10 раз поскольку в условии указывает когда num
    будет равна 10, мы останавливаем код, дальше идут фолс значения
         */
    var s = true
    var num = 0
    while (s) {
        num++
        if (num == 10) s = false
        println("readLine()!!.toInt()")

    }
    //3
    while(true){
        var number = readln()
        println("You input $number value")
    }
}