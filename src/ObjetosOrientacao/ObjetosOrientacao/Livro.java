package ObjetosOrientacao;

public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes() {

        System.out.println("\nDetalhes do livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }

        System.out.println("--");
    }

    private boolean temAutor() {
        return false;
    }

    void adicionaValor(double valor) {
        this.valor = valor;
    }
    
    double retornaValor(){
        return this.valor;
    }

    public boolean aplicaDescontoDe(double d) {
        return false;
    }
    
}