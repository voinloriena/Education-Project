fun main() {
    val a:Int = 1
    when (a) {
        10 -> print("value == 10")
        20 -> print("value == 20")
        in 1..29 -> print("value in range of 1 to 29")
        else -> {
            print("value not 10")
            print("value not 20")


        }
    }
}


