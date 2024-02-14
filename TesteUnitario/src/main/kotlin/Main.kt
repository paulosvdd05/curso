package org.example

fun countXO(str: String): Boolean{
    val str = str.lowercase();
    var countO = 0;
    var countX = 0;

    for (i in str.indices){
        if(str[i] == 'x'){
            countX ++;
        }
        if(str[i] == 'o'){
            countO ++;
        }
    }

    return countX == countO && countO != 0;


}

fun abc() : Boolean{
    val str: String? = null
    return str!!.length == 0
    //throw NullPointerException()
}

fun main() {
    abc()
}