fun main(){
    val stul: Mebel = Stul("Stul")
    val divan: Mebel = Divan( "Divan")

    stul.build()

    divan.build()

}

abstract  class Mebel(val name:String) {
    //val stul: Mebel = Mebel(name: "Stull") так нельзя делать
    abstract var nameOfMebel: String // Абстрактное свойства
    abstract fun build()// Абстрактное функция метод
}
class Stul(name:String): Mebel(name){// пишем класс который хотим уноследовать
    override var nameOfMebel: String
        get() = TODO("Not yet implemented")
        set(value) {}

    // Чтобы реализовать абстрактные методы и поля использовать override
    override fun build() {
        println(" Stull builded")
     }
}

class Divan(name:String): Mebel(name){// пишем класс который хотим уноследовать
    override var nameOfMebel: String
        get() = TODO("Not yet implemented")
        set(value) {}
    // Чтобы реализовать абстрактные методы и поля использовать override
    override fun build() {
        println("Divan builded")
    }
}

//abstract class Figure{
  //  abstract fun calculateArea(): Float
//}
//class Circle: Figure(radius: Float):Figure(){
  //  val radius = radius
   // override fun calculateArea(): Float {
     //   return 3.14 * radius*radius
    //}
//}



//abstract class Figure{
//  abstract fun calculateArea(): Float
//}
//class Circle: Figure(height: Float, width:Float):Figure(){
//  val height = height
//  val width = width
// override fun calculateArea(): Float {
//   return width*height
//}
//}
/*
Абстрактные классы - это классы, определенные с модификатором abstract. Отличительной особенностью абстрактных классов
является то, что мы не можем создать объект подобного класса. Например, определим абстрактный класс Human:
Абстрактные классы могут иметь абстрактные методы и свойства.
Если мы наследуем абстрактные классы мы должны реализовать все абстрактные методы и поля
 */
