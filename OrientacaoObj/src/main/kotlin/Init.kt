class Animal (var especie: String){
    init{
        println("init")
    }
    init{
        println("init2")
    }
}

fun main(){
    Animal("Cachorro")
}