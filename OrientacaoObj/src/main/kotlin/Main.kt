class Pessoa(
    val anoNascimento:Int,
    var nome: String
)

fun main() {
    // class - comportamentos e atributos

    //classe (instancia) objetos
    var pessoa: Pessoa = Pessoa(2005, "Paulo")
    pessoa.anoNascimento;
    pessoa.nome;

}