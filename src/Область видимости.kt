fun main(){//Глобальный блок видимости
    //global scope
    var tesrVar: Int = 20
    fun mainA(){// блок видимости А
        fun mainAA(){// блок видимости АА
            var aaC = tesrVar
        }
    }
    fun mainB(){
        var bTestVar = 30
        tesrVar = bTestVar

    }
    fun mainC(){
        //tesrVar = bTestVar // Не могу вызвать переменную с функции mainB поскольку не
        // входит в его зону видимости

    }
}