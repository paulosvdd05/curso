class Pessoa( val anoNascimento:Int, var nome: String){
    fun dormir(){

    }
    fun acordar(){

    }
}

fun main() {
    // class - comportamentos e atributos

    //classe (instancia) objetos
    var pessoa: Pessoa = Pessoa(2005, "Paulo")

    pessoa.nome;
    pessoa.dormir();

}