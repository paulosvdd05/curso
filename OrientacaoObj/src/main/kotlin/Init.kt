class Animal (var especie: String){

    var fala: String = ""
    init{
        if(especie == "cachorro"){
            fala = "au"
            }else if(especie == "gato"){
                fala = "miau"
        }

    }

    fun falar(){
        println(fala)
    }
}

fun main(){
    var p: Planeta = Planeta()
    p.nome
}