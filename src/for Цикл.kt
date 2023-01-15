fun main(){
    val intArr: IntArray = intArrayOf(1,2,3,4)
    for(someInt in intArr){
        println(someInt)
    }
    for(someInt in 1..20){
        println(someInt)
    }
    for(i in intArr.indices){
        println(intArr[0])
    }
}