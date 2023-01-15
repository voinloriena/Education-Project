class Image{
        constructor(path: String){
            println("Photography address in $path")
        }
    }




data class Product constructor(var title: String, var isFavorite: Boolean = false){ // constructor можно не указывать


        // Все дополнительные конструкторы должны пересекать главный конструктор
        var productTitle = title //Конструктор внутри себя не может хранить код
        constructor(user:User): this(title = user.favoriteProduct.productTitle, isFavorite = user.favoriteProduct.isFavorite){
            println("Class is header $productTitle")
        }
        //isFavorite переменная мы создали чтобы проверить добавлял ли товар в избранное и дали значение boolean
        init{//Блок инициализации пишется тут
            println("Class is header $title")
        }
        init{//Инициализирующий блок они вызываются по очереди как стоят в коде
            println("Class is header again $title")
        }


    }

class User{
    val favoriteProduct = Product("Mercurial")
}




fun main(){
    val image:Image = Image("https//metanit.ru")
    var product: Product = Product("Sneakers", isFavorite = true) //Тут указываем тип данных имя нашего класса
    //Внутри нашего класса мы должны передать наши данных title()
    var product1: Product = Product("Tshort")

    var user: User = User()
    var products: Product = Product(user = user)

    println(product.productTitle) // Мы можем вызвать сам title который хранит в себе данные
    println(product1.productTitle)// Мы создали два разнных переменных с разными данными

    val listOfProducts = listOf<Product>(Product(title = "Short"), product, product1)
    // Передаем классы



    for(p in listOfProducts){
        if(p.isFavorite){ //Прошлись по циклу мы передами значение в переменную isFavorite
            println("Person add product ${p.productTitle} in favorite")
        }
    }
}
/*
Можно создавать классы без фигурных скобок class Empty
Можем создавать несколько init{} блоков и они будут запускаться по очередности
Если у класса есть модификаторы области видимости или аннотации тогда надо обязательно  constructor использовать
 */