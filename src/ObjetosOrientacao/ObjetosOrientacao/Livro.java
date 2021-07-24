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

    public boolean aplicaDescontoDe(double porcentagem) {
        this.valor -= this.valor * porcentagem;
    }

}