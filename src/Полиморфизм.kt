/*
Полиморфизм возможность обьектов с одинаковой спецификацией иметь различную реализацию

Язык программирования поддерживает полиморфизм, если классы с одинаковой спецификацией могут иметь различную
реализацию. например реализация класса может быть изменена в процессе наследования

Кратоко смысл полиморфизма можно выразить фразой Один интерфейс множества реализации
Полиморфизм один из четырех важнейших механизмов обьектно-ориентированного программирования (наряду с
абстракцией, инскапсуляцией и наследованием).
 */

interface NewFigure{}
class NewCircle:NewFigure{}
class NewRectangle:NewFigure{}
class NewSquare:NewFigure{}
class NewShape:NewFigure{}

val circle = NewCircle()
val rectangle = NewRectangle()
val square = NewSquare()
val shape = NewShape()


val collection:MutableList<NewFigure> = mutableListOf(circle,rectangle,square,shape)

