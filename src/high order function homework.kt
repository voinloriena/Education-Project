
fun main(){
    Anime(::Pokemon)
    Anime(::OnePiece)
}
fun Anime(mes: () ->Unit){
    mes()
}
fun Pokemon(){
    println("Pickachu I choose you")
}
fun OnePiece(){
    println("I am Zoro pirates hunter")
}