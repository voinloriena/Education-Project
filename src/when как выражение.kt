fun main(){
var someVar: Any = "Some string"
    someVar = when(someVar){
        is String -> "This is string"
        is Int -> "This is int"
        is Boolean -> "This is Boolean"
        else -> "This is not string. int and boolean"
    }
    println(someVar)

}