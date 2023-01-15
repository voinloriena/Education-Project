fun main(){
}

interface Figure{
    val pi: Float // abstract можем написать так
        get() = 3.14f
    //val pi = 3.14f Нельзя передавать значения
    //interface может содержать абстрактные методы и готовые реализации
    abstract fun calculateArea(): Float
}

interface Rectangle{
    val width: Float
    val height:Float
}

interface Square: Rectangle{
    val size:Float
    override val width: Float
        get() = size
    override val height: Float
        get() = size
}

class RectangleSquare:Square {
    override val size: Float //Готовая реализация
        get() = TODO("Not yet implemented")//Тут мы можем перезаписывать данные
}


class Circle(radius:Float):Figure{

    val radius = radius


    override fun calculateArea(): Float {
        return pi * radius* radius
    }
}

//class Rectangle(height:Float, width:Float):Figure{
//
//    val height = height
//    val width = width
//    override val pi:Float
//    get() = 3.141f
//
//    override fun calculateArea(): Float {
//        return width*height*pi
//    }
//}
/*
Интерфейсы представляют контракт, который должен реализовать класс, Интерфейсы могут содержать объявления свойств
и функции а также их реализация по умолчанию
Для определение интерфейса применяется ключевое число слово interface
В интерфейсах нельзя хранить переменные
 */