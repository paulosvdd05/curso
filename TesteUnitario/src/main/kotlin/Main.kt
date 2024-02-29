package org.example

fun main(){
    println(media(false,10f,8f, "", false))
}

fun <T, J> media( abc: J,vararg notas: T): Float{
    var soma = 0f;
    for(n in notas){
        if(n is Float){
            soma += n
        }

        if(n is String){

        }
    }
    return  (soma/notas.size)
}