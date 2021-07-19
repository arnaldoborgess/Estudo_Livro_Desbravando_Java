public class CalculadorDeEstoque {
    public static void main(String[] args) {
        
        //Utilizando While
        double soma = 0;
        int contador = 0;

        while (contador < 35) {
            double valorDoLivro = 59.90;
            soma = soma + valorDoLivro;
            contador = contador + 1;
        }

        //double livroJava8; reservando região da memória no java com variáveis
        //double livroTDD; tipo doble número com ponto flutuante

        // double livroJava8 = 59.90;
        // double livroTDD = 59.90;

        // double soma = livroJava8 + livroTDD;
        // double sub = livroJava8 - livroTDD;
        // double mult; = livroJava8 * livroTDD;
        // double div = livroJava8 / livroTDD;
        // double modulo = livroJava8 % livroTDD
        System.out.println("O total em estoque soma é "+ soma);

        if (soma <150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma >=2000) {
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom!");
        }
       
        // System.out.println("O total em estoque soma é "+ sub);
        // System.out.println("O total em estoque soma é "+ mult);
        // System.out.println("O total em estoque soma é "+ div);
        // System.out.println("O total em estoque soma é "+ modulo);
    }
}
