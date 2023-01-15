fun main(){
    var Elvira = arrayListOf<String>("E","l","v","i","r","a")
    for(i in Elvira){
        println(i)
    }
    for(i in 0..20){
        if(i%2==0){
            println("Число $i делиться без остатка!")
        }
        else{println("Число $i делиться с остатком")}
    }
}