fun main() {
    val sum = 100
    val rate = when (sum) {
        in 0..100 -> 20
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 0
    }
    println(rate)

    val input = readln().toInt()
    when {
        input > 300 && input < 500 -> println("У вас хорошая зарплата")
        input > 500 && input < 800 -> println("У вас отличная ЗП")
        input > 1000 && input < 1800 -> println("У вас очень хорошая ЗП")
        input > 2000 -> println("У вас очень хорошая ЗП, Вы мой кумир")
    }

}