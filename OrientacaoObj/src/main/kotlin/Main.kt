class Pessoa( val anoNascimento:Int, var nome: String){
    var doc: String? = null
    constructor(anoNascimento: Int, nome: String, doc:String) : this(anoNascimento, nome){
        this.doc = doc;
    }
    fun dormir(){

    }
    fun acordar(){

    }
}

fun main() {
    // class - comportamentos e atributos

    //classe (instancia) objetos
    var pessoa: Pessoa = Pessoa(2005, "Paulo", "3213312321312")

    //this - se refere ao  objeto

    pessoa.nome;
    pessoa.dormir();


    pessoa.doc;

}