package ObjetosOrientacao.ObjetosOrientacao;

public class Livro {
    
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public Livro(Autor autor) {
        this.autor = autor;
	}

    public Livro() {
    }
    

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
        if (porcentagem > 0.3) 
        return false;

        this.valor -= this.valor * porcentagem;
    return true; 
    }

   void getValor(double valor) {
       this.valor = valor;
    } //get pegar adiciona valor

   double setValor() {
       return this.valor;
   } // set atribuir retorna valor

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

public double getValor() {
    return valor;
}

public void setValor(double valor) {
    this.valor = valor;
}

public String getIsbn() {
    return isbn;
}

public void setIsbn(String isbn) {
    this.isbn = isbn;
}

public Autor getAutor() {
    return autor;
}

public void setAutor(Autor autor) {
    this.autor = autor;
}



}
