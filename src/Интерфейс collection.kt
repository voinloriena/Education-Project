fun main(){
    var values = listOf("o","t","three")
    iterateThrowValue(values)
    var setValues = setOf("o","t","three")
    iterateThrowValue(setValues)
}
fun iterateThrowValue(values: Collection<String>){
    for(value in values) println(value)
}
/*
Collection является корнем в иерархии коллекций. Этот интенфейс представляет собой
обычное поведение неизменяемой коллекции типа size get и т.д. Collection наследуется
от интерфейска Iterable который опраделяет опрерации для итерации элементов.
Вы можете использовать Collection как параметр функции, которая может работать с
разными типами коллекции. Для более конкретных случаев следует использовать наследников
Collection: List and Set.

MutableCollection Это Collection с операциями записи, такими как add и remove
 */