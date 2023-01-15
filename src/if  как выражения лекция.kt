fun main    (){
    val a:Int = 10
    val b:Int = 20
    val c:Int = 15
    var maxValue:Int = if (a>b) a
    else if(a==b) c
    else b

    print(maxValue)
}