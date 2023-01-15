fun main(){
    var res = someStuff(a = 10, someFun = {a,b -> a*b})
}
fun someStuff(
    a:Int,
    someFun: (a:Int, b:Int) -> Int,// typealias  Multiplyer = (a:Int, b:Int) -> Int
//Можем его переписать вот так
// и на переменную передать  Multiplyer
// someFun: Multiplyer
): Int{
    return  a*a +someFun(a,a*a)
    //return  a*a +Multiplyer(a,a*a)
}
typealias  Multiplyer = (a:Int, b:Int) -> Int
//Функциональным типам можно присвоить альтернативное имя используя псевдонимы типов
//Ключевое слово typealias

//Функция высшего порядка это когда фунция которая принимает ее как результат или возвращает
// ее как параметр