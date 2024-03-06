class Animal (var especie: String){

    var fala: String = ""
        get(){
            println("Acesso Get")
            return field
        }
        set(value){
            println("Acesso set")
            field = value
        }

}

fun main(){
    var a = Animal("Cachorro")
    a.fala = "auuu"
}