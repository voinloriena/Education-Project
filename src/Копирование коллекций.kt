fun main(){
    // Одно из создании коллекции Если нужно создать коллекцию с существующими
    // значениями используется копирование коллекции неполные копии с исходными копиями
    // если изменять в копии изменения будут и в исходных копиях
    val sourceList = mutableListOf(1,2,3,4,5,6)
    val copyList = sourceList.toMutableList()
    //toMutableList() позволила переменной сделать независимой от переменной
    // и изменения
    println(copyList)

    sourceList.add(8)

    sourceList.removeAt(1)
    println(copyList)
}